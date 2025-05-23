package src.basic.day32;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EchoServerThreadPool {
    private static ServerSocket serverSocket = null;
    private static ExecutorService executorService = Executors.newFixedThreadPool(10); // 10개의 스레드로 요청을 처리하는 스레드풀

    public static void main(String[] args) {
        System.out.println("---------------------------------------------");
        System.out.println("서버를 종료하려면 q 를 입력하고 Enter 키를 입력하세요");
        System.out.println("---------------------------------------------");

        startServer(); // TCP 서버 시작

        // q 또는 Q 키 입력시 서버 종료
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String key = scanner.nextLine();
            if (key.toLowerCase().equals("q")) {
                break;
            }
        }
        scanner.close();

        stopServer(); // TCP 서버 종료
    }

    public static void startServer() {
        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    serverSocket = new ServerSocket(50001); // ServerSocket 생성 및 Port 바인딩
                    System.out.println("[서버] 시작");

                    // TCP 연결 수락
                    Socket socket = serverSocket.accept();

                    // 작업 큐에 처리 작업(스레드) 넣기 - Runnable 은 함수형 인터페이스이므로 람다식 표현가능
                    executorService.execute(() -> {
                        try {
                            // 연결된 TCP 클라이언트의 정보 얻기
                            InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
                            System.out.println("[서버] " + isa.getHostName() + "의 연결 요청을 수락함");

                            // DataInputStream 으로 데이터 받기
                            DataInputStream dis = new DataInputStream(socket.getInputStream());
                            String message = dis.readUTF();

                            // DataOutputStream 으로 데이터 보내기
                            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
                            dos.writeUTF(message);
                            dos.flush();
                            System.out.println("[서버] 받은 데이터를 다시 보냄: " + message);

                            socket.close();
                            System.out.println("[서버] " + isa.getHostName() + "의 연결을 끊음");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    });

                } catch (IOException e) {
                    System.out.println("[서버] " + e.getMessage());
                }
            }
        };
        thread.start();
    }

    public static void stopServer() {
        try {
            serverSocket.close();
            System.out.println("[서버] 종료");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
