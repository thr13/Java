package src.intermediate.ch4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample4 {
    public static void main(String[] args) {
        List<String> title = Arrays.asList("Java8", "In", "Action");
        Stream<String> s = title.stream();
        s.forEach(System.out::println); // 배열 title 의 각 요소를 출력
        s.forEach(System.out::println); // 스트림이 이미 소비됬거나 닫혔기 때문에 java.lang.IllegalStateException 에러 발생
    }
}
