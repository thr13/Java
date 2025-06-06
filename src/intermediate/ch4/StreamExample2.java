package src.intermediate.ch4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;
import static src.intermediate.ch4.Dish.menu;

// 자바8 버전 코드
public class StreamExample2 {
    public static void main(String[] args) {
        List<String> lowCaloricDishes = menu.stream()
                .filter(d -> d.getCalories() < 400)
                .sorted(comparing(Dish::getCalories))
                .map(Dish::getName)
                .collect(toList());

        /*
        // 멀티코어 아키텍처에서 병렬로 실행
        List<String> lowCaloricDishes = menu.parallelStream()
                .filter(d -> d.getCalories() < 400)
                .sorted(comparing(Dish::getCalories))
                .map(Dish::getName)
                .collect(toList());
         */
    }
}
