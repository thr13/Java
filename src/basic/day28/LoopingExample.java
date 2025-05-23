package src.basic.day28;

import java.util.Arrays;

public class LoopingExample {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};

        // 중간 처리 메소드 peek() - Stream 반환
        int total = Arrays.stream(intArr)
                .filter(a -> a % 2 == 0)
                .peek(n -> System.out.println(n)) // 중간연산
                .sum(); // 최종처리
        System.out.println("총합: " + total + "\n");

        // 최종 처리 메소드 forEach() - 반환값 없음
        Arrays.stream(intArr)
                .filter(a -> a % 2 == 0)
                .forEach(n -> System.out.println(n)); // 최종처리
    }
}
