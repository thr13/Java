package src.intermediate.ch5;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMakingExample {
    public static void main(String[] args) {
        // 값으로 스트림 만들기
        Stream<String> stream = Stream.of("Modern ", "Java ", "In ", "Action ");
        stream.map(String::toUpperCase).forEach(System.out::println);

        // 빈 스트림 생성
        Stream<String> emptyStream = Stream.empty();

        // null 이 될 수 있는 객체로 스트림 만들기
        Stream<String> values = Stream.of("config", "home", "user")
                .flatMap(key -> Stream.ofNullable(System.getProperty(key)));

        // 기본형 int 로 이루어진 배열을 IntStream 으로 변환하기
        int[] numbers = {2, 3, 5, 7, 11, 13};
        int sum = Arrays.stream(numbers).sum();
        System.out.println(sum);

        // 파일에서 고유한 단어 수를 찾는 프로그램
        long uniqueWords = 0;
        try(Stream<String> lines = Files.lines(Paths.get("data.txt"), Charset.defaultCharset())){
            uniqueWords = lines.flatMap(line -> Arrays.stream(line.split(" ")))
                    .distinct()
                    .count();
        } catch (IOException e) {

        }

        // iterate() 예제1
        Stream.iterate(0, n -> n + 2).limit(10).forEach(System.out::println);

        // iterate() 예제2
        IntStream.iterate(0, n -> n < 100, n -> n + 4).forEach(System.out::println);

        // generate 예제1
        Stream.generate(Math::random).limit(5).forEach(System.out::println);
    }
}
