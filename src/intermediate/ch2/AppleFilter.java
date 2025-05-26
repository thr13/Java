package src.intermediate.ch2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class AppleFilter {
    public static <T> List<T> filter(List<T> list, Predicate<T> p) {
        List<T> result = new ArrayList<>();
        for (T e : list) {
            if (p.test(e)) {
                result.add(e);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // Apple 객체를 리스트로 생성
        List<Apple> inventory = Arrays.asList(
                new Apple(80, "green"),
                new Apple(155, "green"),
                new Apple(120, "red")
        );

        // 자바8 람다 표현식
        List<Apple> redApples = filter(inventory, (Apple apple) -> Color.RED.equals(apple.getColor()));

        // 자바8 람다 표현식을 이용하여 스레드 코드 구현
        Thread thread = new Thread(() -> System.out.println("Hello world"));
        thread.start();
    }
}
