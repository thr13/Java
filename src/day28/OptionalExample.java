package src.day28;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        /*
        컬렉션에 제공할 집계값이 없으므로 NoSuchElementException 발생
        double avg = list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .getAsDouble();
         */

        // NoSuchElementException 상황방지1 - isPresent() 메소드 사용
        OptionalDouble optionalDouble = list.stream()
                .mapToInt(Integer::intValue)
                .average();

        if (optionalDouble.isPresent()) {
            System.out.println("isPresent 사용: " + optionalDouble.getAsDouble());
        } else {
            System.out.println("0.0");
        }

        // NoSuchElementException 상황방지2 - orElse() 메소드로 디폴트 값 설정
        double avg = list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0); // 디폴트 값 설정
        System.out.println("orElse 사용: " + avg);

        // NoSuchElementException 상황방지3 - ifPresent() 메소드로 집계값이 존재할 경우에만 동작
        list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .ifPresent(a -> System.out.println("ifPresent 사용: " + a));
    }
}
