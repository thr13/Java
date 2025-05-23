package src.basic.day33;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketAddress;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NewServerThreadPool {
    private static DatagramSocket datagramSocket = null; // 출발지, 도착지 역할을 할 DatagramSocket
    private static ExecutorService executorService = Executors.newFixedThreadPool(10); // 스레드풀(스레드 10개 요청처리)

    public static void main(String[] args) throws Exception {
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
                        DatagramPacket receivePacket = new DatagramPacket(new byte[1024], 1024);
                        datagramSocket.receive(receivePacket);

                        // 작업 큐에 처리 작업 넣음
                        executorService.execute(() -> {
                            try {
                                String newsKind = new String(receivePacket.getData(), 0, receivePacket.getLength(), "UTF-8");

                                SocketAddress socketAddress = receivePacket.getSocketAddress();

                                for(int i=1; i<=10; i++) {
                                    String data = newsKind + ": 뉴스" + i;
                                    byte[] bytes = data.getBytes("UTF-8");
                                    DatagramPacket sendPacket = new DatagramPacket(bytes, 0, bytes.length, socketAddress); // 전송할 데이터를 DatagramPacket 객체로 생성
                                    datagramSocket.send(sendPacket); // 데이터 전송
                                }

                            } catch (Exception e) {

                            }
                        });
                    }
                } catch (Exception e) {
                    System.out.println("[서버] " + e.getMessage());
                }
            }
        };
        thread.start();
    }

    public static void stopServer() {
        datagramSocket.close(); // DatagramSocket 을 닫고 Port 언바인딩
        executorService.shutdownNow(); // 스레드 풀 종료
        System.out.println("[서버] 종료");
    }
}
