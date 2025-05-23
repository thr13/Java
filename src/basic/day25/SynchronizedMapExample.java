package src.basic.day25;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SynchronizedMapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = Collections.synchronizedMap(new HashMap<>()); // Collections 에서 제공하는 동기화 메소드 래핑시키는 메소드 synchronizedMap()
        //Map<Integer, String> map = new HashMap<>(); // HashMap 은 비동기적 메소드를 가지므로 멀티스레드 환경에서 메소드 호출시 경합이 발생함

        Thread threadA = new Thread() {
            @Override
            public void run() {
                for(int i=1; i<=1000; i++) {
                    map.put(i, "내용"+i);
                }
            }
        };

        Thread threadB = new Thread() {
            @Override
            public void run() {
                for(int i=1001; i<=2000; i++) {
                    map.put(i, "내용"+i);
                }
            }
        };

        threadA.start();
        threadB.start();

        try {
            threadA.join();
            threadB.join();
        } catch (Exception e) {

        }

        int size = map.size();
        System.out.println("총 객체 수: " + size);
        System.out.println();
    }
}
