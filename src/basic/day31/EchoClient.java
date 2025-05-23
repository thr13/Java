package src.basic.day31;

import java.io.*;
import java.net.Socket;

public class EchoClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 50001);
            System.out.println("[클라이언트] 연결 성공");

            /*
            // 클라이언트에서 서버로 데이터 보내기
            String sendMessage = "나는 자바가 좋아";
            OutputStream os = socket.getOutputStream();
            byte[] bytes = sendMessage.getBytes("UTF-8");
            os.write(bytes);
            os.flush();
            System.out.println("[클라이언트] 데이터 보냄: " + sendMessage);

            // 서버에서 보낸 데이터 받기
            InputStream is = socket.getInputStream();
            bytes = new byte[1024];
            int readByteCount = is.read(bytes);
            String receiveMessage = new String(bytes, 0, readByteCount, "UTF-8");
            System.out.println("[클라이언트] 데이터 받음: " + receiveMessage);
             */

            // 클라이언트에서 서버로 데이터 보내기
            String sendMessage = "나는 자바가 좋아~~";
            DataOutputStream os = new DataOutputStream(socket.getOutputStream());
            os.writeUTF(sendMessage);
            os.flush();
            System.out.println("[클라이언트] 데이터 보냄: " + sendMessage);

            // 서버에서 보낸 데이터 받기
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            String receiveMessage = dis.readUTF();
            System.out.println("[클라이언트] 데이터 받음: " + receiveMessage);

            // 연결 종료
            socket.close();
            System.out.println("[클라이언트] 연결 끊음");
        } catch (IOException e) {
            System.out.println("[클라이언트] " + e.getMessage());
        }


    }
}
