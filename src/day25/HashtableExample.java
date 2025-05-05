package src.day25;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashtableExample {
    public static void main(String[] args) {
        // HashMap 과 Hashtable 비교 - 동기화된 메소드 유무
        Map<String, Integer> map = new Hashtable<>();
        //Map<String, Integer> map = new HashMap<>();

        // 작업 스레드 객체 생성
        Thread threadA = new Thread(){
            @Override
            public void run() {
                // 엔트리 1000개 추가
                for(int i=1; i<=1000; i++) {
                    map.put(String.valueOf(i), i);
                }
            }
        };

        // 작업 스레드 객체 생성
        Thread threadB = new Thread(){
            @Override
            public void run() {
                // 엔트리 1000개 추가
                for(int i=1001; i<=2000; i++) {
                    map.put(String.valueOf(i), i);
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
        System.out.println("총 엔트리 수: " + size);
        System.out.println();
    }
}
