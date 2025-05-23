package src.basic.day33;

import org.json.JSONObject;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ChatServer {
    ServerSocket serverSocket; // 채팅 클라이언트에서 받은 연결요청을 관리하는 객체
    ExecutorService threadPool = Executors.newFixedThreadPool(100); // 100 개의 스레드를 관리하는 스레드풀
    Map<String, SocketClient> chatRoom = Collections.synchronizedMap(new HashMap<>()); // SocketClient 를 관리하는 동기화된 Map

    // 서버 시작 메소드
    public void start() throws IOException {
        serverSocket = new ServerSocket(50001); // 50001 포트 바인딩
        System.out.println("[서버] 시작됨");

        // 작업 스레드
        Thread thread = new Thread(() -> {
            try {
                while(true) {
                    Socket socket = serverSocket.accept(); // 클라이언트 연결요청 수락
                    SocketClient sc = new SocketClient(this, socket); // 통신용 SocketClient 객체 생성(반복)
                }
            } catch (IOException e) {

            }
        });
        thread.start();
    }

    // 클라이언트 연결시 생성한 SocketClient 를 chatRoom(채팅방) 에 추가
    public void addSocketClient(SocketClient socketClient) {
        String key = socketClient.chatName + "@" + socketClient.clientIp;
        chatRoom.put(key, socketClient);
        System.out.println("입장: " + key);
        System.out.println("현재 채팅자 수: " + chatRoom.size() + "\n");
    }

    // 클라이언트 연결종료시 SocketClient 를 chatRoom 제거
    public void removeSocketClient(SocketClient socketClient) {
        String key = socketClient.chatName + "@" + socketClient.clientIp;
        chatRoom.remove(key);
        System.out.println("나감: " + key);
        System.out.println("현재 채팅자 수: " + chatRoom.size() + "\n");
    }

    // 모든 클라이언트에게 메시지를 보내는 기능
    public void sendToAll(SocketClient sender, String message) {
        JSONObject root = new JSONObject();
        root.put("clientIp", sender.clientIp);
        root.put("chatName", sender.chatName);
        root.put("message", message);

        String json = root.toString();

        Collection<SocketClient> socketClients = chatRoom.values(); // values() 메소드로 Collection<SocketClient> 를 얻음
        for(SocketClient sc: socketClients) {
            if(sc == sender) {
                continue;
            }
            sc.send(json); // SocketClient 에 send() 메소드로 JSON 메시지를 보냄
        }
    }

    // 서버 종료
    public void stop() {
        try {
            serverSocket.close(); // ServerSocket 메모리 해제
            threadPool.shutdownNow(); // 스레드풀 종료
            chatRoom.values().stream().forEach(sc -> sc.close()); // chatRoom 에 있는 모든 SocketClient 종료 및 요소 스트림을 이용한 전체 SocketClient 의 close() 메소드 호출
            System.out.println("[서버] 종료됨 ");
        } catch (IOException e) {
            System.err.println("[서버] 오류발생 " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        try {
            ChatServer chatServer = new ChatServer();
            chatServer.start();

            System.out.println("--------------------------------------------");
            System.out.println("서버를 종료하려면 q 를 입력하고 Enter 를 입력하세요");
            System.out.println("--------------------------------------------");

            Scanner scanner = new Scanner(System.in);
            while(true) {
                String key = scanner.nextLine();
                if (key.toLowerCase().equals("q")) {
                    break;
                }
            }
            scanner.close();
            chatServer.stop(); // 서버 종료 메소드 호출
        } catch (IOException e) {
            System.out.println("[서버] " + e.getMessage());
        }
    }
}
