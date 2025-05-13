package src.day30;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExample {
    public static void main(String[] args) {
        try {
            InetAddress local = InetAddress.getLocalHost(); // 로컬 컴퓨터의 IP 주소 얻음
            System.out.println("내 컴퓨터 IP 주소: " + local.getHostAddress());

            InetAddress[] inArr = InetAddress.getAllByName("www.naver.com"); // 네이버 웹 사이트의 IP 정보를 배열로 받아옴
            for (InetAddress remote : inArr) {
                System.out.println("www.naver.com IP 주소: " + remote.getHostAddress());
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
