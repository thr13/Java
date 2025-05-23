package src.basic.day27;

import java.util.ArrayList;
import java.util.List;

public class FilteringExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("홍길동");
        list.add("신용권");
        list.add("김자바");
        list.add("신용권");
        list.add("신민철");

        // distinct() 메소드를 이용해서 중복요소제거
        list.stream()
                .distinct()
                .forEach(d -> System.out.println(d));
        System.out.println();

        // "신" 으로 시작하는 요소만 필터링 (중복요소 제거 X)
        list.stream()
                .filter(p -> p.startsWith("신")) // String 클래스의 startsWith() 메소드는 매개값으로 주어진 문자열로 시작하면 true, 그렇지 않으면 false 리턴
                .forEach(p -> System.out.println(p));
        System.out.println();

        // 중복 요소를 먼저 제거한 후 "신" 으로 시작하는 요소만 필터링
        list.stream()
                .distinct()
                .filter(p -> p.startsWith("신"))
                .forEach(p -> System.out.println(p));
    }
}
