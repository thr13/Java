package src.day25;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new LinkedList<>();

        long startTime;
        long endTime;

        // ArrayList 컬렉션에 저장
        startTime = System.nanoTime(); // 작업 시작 시간 측정
        for(int i=0; i<10000; i++) {
            list1.add(0, String.valueOf(i));
        }
        endTime = System.nanoTime(); // 작업 종료 시간 측정
        System.out.printf("%-17s %8d ns \n", "ArrayList 걸린 시간: ", (endTime - startTime));

        // LinkedList 컬렉션에 저장
        startTime = System.nanoTime();
        for(int i=0; i<10000; i++) {
            list2.add(0, String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.printf("%-17s %8d ns \n", "LinkedList 걸린 시간: ", (endTime - startTime));
    }
}
