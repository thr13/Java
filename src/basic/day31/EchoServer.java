package src.basic.day31;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoServer {
    private static ServerSocket serverSocket = null;

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

                    // 클라이언트 연결 요청 수락 및 데이터 통신
                    while (true) {
                        System.out.println("\n[서버] 연결 요청 대기중\n");
                        Socket socket = serverSocket.accept(); // 서버측에서 클라이언트 연결 요청 수락

                        // 연결된 클라이언트 정보 획득
                        InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
                        System.out.println("[서버] " + isa.getHostName() + "의 연결 요청을 수락함");

                        /*
                        // InputStream 으로 데이터 받기
                        InputStream is = socket.getInputStream();
                        byte[] bytes = new byte[1024];
                        int readByteCount = is.read(bytes);
                        String message = new String (bytes, 0, readByteCount, "UTF-8");

                        // OutputStream 으로 데이터 보내기
                        OutputStream os = socket.getOutputStream();
                        bytes = message.getBytes("UTF-8");
                        os.write(bytes);
                        os.flush();
                        System.out.println("[서버] 받은 데이터를 다시 보냄: " + message);
                         */

                        // DataInputStream 으로 데이터 받기
                        DataInputStream dis = new DataInputStream(socket.getInputStream());
                        String message = dis.readUTF();

                        // DataOutputStream 으로 데이터 보내기
                        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
                        dos.writeUTF(message);
                        dos.flush();
                        System.out.println("[서버] 받은 데이터를 다시 보냄: " + message);

                        // 연결 종료
                        socket.close();
                        System.out.println("[서버] " + isa.getHostName() + "의 연결을 끊음");
                    }
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
