package src.basic.day32;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

// NewsServer 에서 구독하고 싶은 뉴스 주제를 보내고 관련 뉴스 10개 받는 UDP 클라이언트
public class NewsClient {
    public static void main(String[] args) {
        try {
            // DatagramSocket 생성 (출발지 & 도착지)
            DatagramSocket datagramSocket = new DatagramSocket();

            String data = "IT";
            byte[] bytes = data.getBytes("UTF-8");
            DatagramPacket sendPacket = new DatagramPacket(
                    bytes, bytes.length, new InetSocketAddress("localhost", 50001)
            );
            datagramSocket.send(sendPacket);

            while (true) {
                // 뉴스 받기
                DatagramPacket receivePacket = new DatagramPacket(new byte[1024], 1024);
                datagramSocket.receive(receivePacket);

                // 받은 뉴스 데이터를 문자열로 변환
                String news = new String(receivePacket.getData(), 0, receivePacket.getLength(), "UTF-8");
                System.out.println(news);

                // 10 번째 뉴스를 받으면 while 문 종료
                if(news.contains("뉴스10")) {
                    break;
                }
            }

            // DatagramSocket 닫기
            datagramSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
