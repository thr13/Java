package src.basic.day27;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MapExample2 {
    public static void main(String[] args) {
        int[] intArray = { 1, 2, 3, 4, 5}; // 정수형 배열 생성

        IntStream intStream = Arrays.stream(intArray); // 정수형 배열을 Stream 객체로 변환
        intStream
                .asDoubleStream() // int -> double 형변환
                .forEach(s -> System.out.println(s));
        System.out.println();

        intStream = Arrays.stream(intArray);
        intStream
                .boxed() // int -> Integer 래퍼(Wrapper) 클래스 형변환
                .forEach(obj -> System.out.println(obj.intValue()));
    }
}
