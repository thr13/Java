package src.basic.day27;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPipeLineExample {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("홍길동", 10),
                new Student("신용권", 20),
                new Student("유미선", 30)
        );

        // 체이닝 패턴 X
        Stream<Student> studentStream = list.stream(); // 오리지널 스트림
        IntStream scoreStream = studentStream.mapToInt(student -> student.getScore()); // 중간처리
        double avg1 = scoreStream.average().getAsDouble(); // 최종 처리
        System.out.println("평균 점수: = " + avg1);

        // 체이닝 패턴 O
        double avg2 = list.stream()
                .mapToInt(student -> student.getScore())
                .average()
                .getAsDouble();
        System.out.println("평균 점수(체이닝 패턴): "+ avg2);
    }
}
