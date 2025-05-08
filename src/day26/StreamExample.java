package src.day26;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        // 컬렉션 Set
        Set<String> set = new HashSet<>();
        set.add("홍길동");
        set.add("신용권");
        set.add("김자바");

        // Stream 을 이용한 요소 반복 처리
        Stream<String> stream = set.stream(); // 컬렉션의 stream() 메소드를 이용해서 Stream 객체를 얻음
        stream.forEach( name -> System.out.println(name)); // 람다식을 사용해서 Stream 객체의 요소를 처리 (여기서는 요소 하나하나 출력함)
    }
}