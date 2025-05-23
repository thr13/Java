package src.basic.day31;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketAddress;
import java.util.Scanner;

// UDP 클라이언트가 구독하고 싶은 뉴스 10개를 전송하는 UDP 서버
public class NewsServer {
    private static DatagramSocket datagramSocket = null; // UDP 서버(또는 클라이언트)를 위한 DatagramSocket 객체

    public static void main(String[] args) {
        System.out.println("---------------------------------------------");
        System.out.println("서버를 종료하려면 q 를 입력하고 Enter 키를 입력하세요");
        System.out.println("---------------------------------------------");

        startServer(); // UDP 서버 시작

        // q 또는 Q 키 입력시 서버 종료
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String key = scanner.nextLine();
            if (key.toLowerCase().equals("q")) {
                break;
            }
        }
        scanner.close();

        stopServer(); // UDP 서버 종료
    }

    public static void startServer() {
        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    // DatagramSocket 생성 및 Port 바인딩
                    datagramSocket = new DatagramSocket(50001);
                    System.out.println("[서버] 시작");

                    while (true) {
                        // UDP 클라이언트가 구독할 뉴스 주제 얻기
                        DatagramPacket receivePacket = new DatagramPacket(new byte[1024], 1024); // 수신된 데이터를 담을 DatagramPacket 객체
                        datagramSocket.receive(receivePacket); // 데이터 수신

                        // 읽은 데이터를 문자열로 생성
                        String newsKind = new String(receivePacket.getData(), 0, receivePacket.getLength(), "UTF-8");

                        // UDP 클라이언트의 IP 와 Port 얻기
                        SocketAddress socketAddress = receivePacket.getSocketAddress();

                        // 10 개의 뉴스를 UDP 클라이언트에게 전송
                        for(int i=1; i<=10; i++) {
                            String data = newsKind + ": 뉴스" + i;
                            byte[] bytes = data.getBytes("UTF-8");
                            DatagramPacket sendPacket = new DatagramPacket(bytes, 0, bytes.length, socketAddress); // 전송할 데이터를 DatagramPacket 객체로 생성
                            datagramSocket.send(sendPacket); // 데이터 전송
                        }
                    }
                } catch (Exception e) {
                    System.out.println("[서버] " + e.getMessage());
                }
            }
        };
        thread.start();
    }

    public static void stopServer() {
        // DatagramSocket 을 닫고 Port 언바인딩
        datagramSocket.close();
        System.out.println("[서버] 종료");
    }
}
