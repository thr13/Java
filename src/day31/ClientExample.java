package src.day31;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

// 이 코드를 실행하기 전에 서버를 담당하는 ServerExample.class 파일이 실행되어 있어야 한다
public class ClientExample {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 5000); // 로컬 컴퓨터 서버로 연결 요청 (port 번호는 서버측과 같아야함)
            System.out.println("[클라이언트] 연결 성공");

            socket.close(); // Socket 닫기 -> 서버 종료시 클라이언트도 자동으로 종료됨
            System.out.println("[클라이언트] 연결 종료");
        } catch (IOException e) {
            // IP 표기 방법이 잘못된 경우
            e.printStackTrace();
        }
    }
}
