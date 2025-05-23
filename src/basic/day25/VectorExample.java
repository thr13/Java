package src.basic.day25;

import java.util.List;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        // Vector 와 ArrayList 차이: Vector 는 동기화된 메소드를 가지고 ArrayList 는 비동기화된 메소드를 가진다
        List<Board> list = new Vector<>();
        //List<Board> list = new ArrayList<>();

        // 작업 스레드 객체 생성
        Thread threadA = new Thread() {
            // 작업 추가
            @Override
            public void run() {
                for(int i = 1; i<=1000; i++) {
                    list.add(new Board("제목"+i, "내용"+i, "글쓴이"+i));
                }
            }
        };

        Thread threadB = new Thread() {
            @Override
            public void run() {
                for(int i = 1001; i<=2000; i++) {
                    list.add(new Board("제목"+i, "내용"+i, "글쓴이"+i));
                }
            }
        };

        // 작업 스레드 실행
        threadA.start();
        threadB.start();

        // 작업 스레드가 모두 종료될떄까지 main 스레드 대기
        try {
            threadA.join();
            threadB.join();
        } catch (InterruptedException e) {
        }

        int size = list.size();
        System.out.println("총 객체 수: " + size);
        System.out.println();
    }
}
