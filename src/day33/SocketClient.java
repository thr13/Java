package src.day33;

import org.json.JSONObject;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

// SocketClient 는 서버에서 클라이언트와 1:1 로 통신하는 역할
public class SocketClient {
    ChatServer chatServer;
    Socket socket;
    DataInputStream dis;
    DataOutputStream dos;
    String clientIp;
    String chatName;

    public SocketClient(ChatServer chatServer, Socket socket) {
        try {
            this.chatServer = chatServer;
            this.socket = socket;
            this.dis = new DataInputStream(socket.getInputStream()); // 문자열 입력 스트림 생성
            this.dos = new DataOutputStream(socket.getOutputStream()); // 문자열 출력 스트림 생성
            InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
            this.clientIp = isa.getHostName();
            receive();
        } catch (IOException e) {
            System.out.println("[서버] SocketClient 오류 " + e.getMessage());
        }
    }

    // JSON 데이터를 받는 메소드
    public void receive() {
        chatServer.threadPool.execute(() -> {
            try {
                while(true) {
                    String receiveJson = dis.readUTF(); // 스트림에서 JSON 파일 읽기

                    JSONObject jsonObject = new JSONObject(receiveJson); // 읽어온 JSON 파일을 JSONObject 로 파싱
                    String command = jsonObject.getString("command");

                    // 읽어온 command 에 따라 처리 내용 결정
                    switch (command) {
                        case "incoming":
                            this.chatName = jsonObject.getString("data");
                            chatServer.sendToAll(this, "들어오셨습니다");
                            chatServer.addSocketClient(this);
                            break;
                        case "message":
                            String message = jsonObject.getString("data");
                            chatServer.sendToAll(this, message);
                            break;
                    }
                }
            } catch (IOException e) {
                // 채팅을 종료할 경우 dis.readUTF() 메소드에서 IOException 이 발생함
                chatServer.sendToAll(this, "나가셨습니다");
                chatServer.removeSocketClient(this); // chatRoom 에 저장된 SocketClient 제거
            }
        });
    }

    // 서버와 연결된 클라이언트에게 JSON 메시지를 보내는 메소드
    public void send(String json) {
        try {
            dos.writeUTF(json);
            dos.flush();
        } catch (IOException e) {

        }
    }

    // 클라이언트와의 연결 종료 메소드 -> ChatServer 의 stop() 메소드에서 호출됨
    public void close() {
        try {
            socket.close();
        } catch (IOException e) {

        }
    }
}
