package src.basic.day27;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample3 {
    public static void main(String[] args) {
        String[] strArray = { "홍길동", "신용권", "김미나"}; // 문자열 배열
        Stream<String> strStream = Arrays.stream(strArray); // 문자열 배열로부터 stream 객체 얻기
        strStream.forEach(item -> System.out.print(item + ","));
        System.out.println();

        int[] intArray = { 1, 2, 3, 4, 5 }; // 정수형 배열
        IntStream intStream = Arrays.stream(intArray); // 정수형 배열로부터 stream 객체 얻기
        intStream.forEach(item -> System.out.print(item + ","));
        System.out.println();
    }
}
