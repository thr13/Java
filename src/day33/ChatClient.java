package src.day33;

import org.json.JSONObject;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

// 채팅 클라이언트 - 채팅 서버에 연결 요청
public class ChatClient {
    Socket socket;
    DataInputStream dis; // 문자열을 읽을 보조스트림
    DataOutputStream dos; // 문자열을 보내는 보조스트림
    String chatName;

    // 서버에 연결 요청을 보내는 메소드
    public void connect() throws IOException {
        socket = new Socket("localhost", 50001); // 채팅 서버에 연결 요청
        dis = new DataInputStream(socket.getInputStream());
        dos = new DataOutputStream(socket.getOutputStream());
        System.out.println("[클라이언트] 서버에 연결됨");
    }

    // JSON 파일을 받는 메소드
    public void receive() {
        Thread thread = new Thread(() -> {
            try {
                while(true) {
                    String json = dis.readUTF(); // JSON 데이터 읽기
                    JSONObject root = new JSONObject(json); // 읽어온 데이터를 JSONObject 파싱
                    String clientIp = root.getString("clientIp");
                    String chatName = root.getString("chatName");
                    String message = root.getString("message");
                    System.out.println("<" + chatName + "@" + clientIp + "> " + message); // 콘솔창에 파싱한 데이터를 출력
                }
            } catch (Exception e) {
                System.out.println("[클라이언트] 서버 연결 끊김");
                System.exit(0); // 프로그램 종료
            }
        });
    }

    // 서버에 JSON 메시지를 보내는 메소드
    public void send(String json) throws IOException {
        dos.writeUTF(json);
        dos.flush();
    }

    // 클라이언트와 서버의 연결 종료 메소드
    public void unconnect() throws IOException {
        socket.close();
    }

    public static void main(String[] args) {
        try {
            ChatClient chatClient = new ChatClient();
            chatClient.connect(); // 서버 연결 요청 메소드 호출

            Scanner scanner = new Scanner(System.in);
            System.out.println("대화명 입력: ");
            chatClient.chatName = scanner.nextLine();

            // JSON 메시지 생성 및 서버 전송
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("commend", "incomming");
            jsonObject.put("data", chatClient.chatName);
            String json = jsonObject.toString();
            chatClient.send(json);

            // 채팅서버에서 보내는 메시지 받기
            chatClient.receive();

            System.out.println("--------------------------------------------");
            System.out.println("서버를 종료하려면 q 를 입력하고 Enter 를 입력하세요");
            System.out.println("--------------------------------------------");

            while(true) {
                String message = scanner.nextLine();
                if (message.toLowerCase().equals("q")) {
                    break;
                } else {
                    jsonObject = new JSONObject();
                    jsonObject.put("commend", "message");
                    json = jsonObject.toString();
                    chatClient.send(json);
                }
            }
            scanner.close();
            chatClient.unconnect();
        } catch (IOException e) {
            System.out.println("[클라이언트] 서버 연결 안됨");
        }
    }
}
