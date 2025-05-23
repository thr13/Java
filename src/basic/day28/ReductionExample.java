package src.basic.day28;

import java.util.Arrays;
import java.util.List;

public class ReductionExample {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("홍길동", 92),
                new Student("신용권", 95),
                new Student("김자바", 88)
        );

        // 기본 집계 함수
        int sum1 = studentList.stream()
                .mapToInt(Student::getScore)
                .sum();
        System.out.println("sum1: " + sum1);

        // reduce() 메소드를 이용한 집계 함수 사용
        int sum2 = studentList.stream()
                .mapToInt(Student::getScore)
                .reduce(0, (a, b) -> a + b);
        System.out.println("sum2: " + sum2);
    }
}
