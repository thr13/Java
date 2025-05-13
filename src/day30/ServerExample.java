package src.day30;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerExample {
    private static ServerSocket serverSocket;

    public static void main(String[] args) {
        System.out.println("---------------------------------------------------");
        System.out.println("서버를 종료하려면 q 또는 Q 를 입력하고 Enter 키를 입력하세요");
        System.out.println("---------------------------------------------------");

        // TCP 서버 시작
        startServer();

        // 키입력 - q 또는 Q 를 입력받을 경우 입력 종료
        Scanner scanner = new Scanner(System.in);
        while(true) {
            String key = scanner.nextLine();
            if(key.toLowerCase().equals("q")) {
                break;
            }
        }
        scanner.close();

        // TCP 서버 종료
        stopServer();
    }

    public static void startServer() {
        // 작업 스레드
        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    // ServerSocket 생성 및 5000번 Port 바인딩
                    serverSocket = new ServerSocket(5000);
                    System.out.println("[서버] 시작");

                    while (true) {
                        System.out.println("\n[서버] 클라이언트의 연결 요청 대기중\n");
                        // 연결 수락
                        Socket socket = serverSocket.accept();

                        // 연결된 클라이언트 정보 획득
                        InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
                        System.out.println("[서버] " + isa.getHostString() + "의 연결 요청을 수락함");

                        // 연결 끊기
                        socket.close();
                        System.out.println("[서버] " + isa.getHostString() + "의 연결 요청을 끊음");
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
            // ServerSocket 을 닫고 Port 언바인딩
            serverSocket.close();
            System.out.println("[서버] 종료");
        } catch (IOException e) {
            System.out.println("[서버] " + e.getMessage());
        }
    }
}
