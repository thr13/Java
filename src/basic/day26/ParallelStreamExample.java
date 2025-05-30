package src.basic.day26;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("홍길동");
        list.add("신용권");
        list.add("김자바");
        list.add("람다식");
        list.add("박병렬");

        Stream<String> parallelStream = list.parallelStream(); // parallelStream() 메소드는 병렬처리 스트림을 반환한다
        parallelStream.forEach(name -> {
            System.out.println(name + ": " + Thread.currentThread().getName());
        });
    }
}
