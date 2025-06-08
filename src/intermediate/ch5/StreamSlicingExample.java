package src.intermediate.ch5;

import src.intermediate.ch4.Dish;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class StreamSlicingExample {
    public static void main(String[] args) {
        List<Dish> specialMenu = Arrays.asList(
                new Dish("seasonal fruit", true, 120, Dish.Type.OTHER),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("rice", true, 320, Dish.Type.OTHER),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", true, 530, Dish.Type.OTHER)
        );

        // 320 칼로리 미만 요리 선택하기 - filter() 메서드는 모든 요소에 프레디케이트를 적용함
        List<Dish> filteredMenu = specialMenu.stream()
                .filter(dish -> dish.getCalories() < 320)
                .collect(toList());
        System.out.println(filteredMenu);

        // takeWhile() 메서드는 Predicate 가 처음으로 false 를 반환하기 전까지 요소를 반환하고 스트림 파이프라인을 전달하지않음
        List<Dish> slicedMenu1 = specialMenu.stream()
                .takeWhile(dish -> dish.getCalories() < 320)
                .collect(toList());
        System.out.println(slicedMenu1);

        // dropWhile() 메서드는 takeWhile() 과 동작은 비슷하지만, Predicate 가 처음으로 false 를 반환한 요소부터 끝까지 남은 요소를 반환함
        List<Dish> slicedMenu12 = specialMenu.stream()
                .dropWhile(dish -> dish.getCalories() < 320) // 사실상 320 칼로리 이상 요리 선택
                .collect(toList());
        System.out.println(slicedMenu12);

        // limit(n) 메소드는 최대 n 개의 요소를 반환함
        List<Dish> dishes1 = specialMenu.stream()
                .filter(dish -> dish.getCalories() > 300) // 300 칼로리를 초과하는 요리 선택
                .limit(3) // 최대 3개까지 반환가능
                .collect(toList());
        System.out.println(dishes1);

        // skip(n) 메소드는 처음 n개 요소를 제외한 스트림을 반환함
        List<Dish> dishes2 = specialMenu.stream()
                .filter(dish -> dish.getCalories() > 300) // 300 칼로리를 초과하는 요리 선택
                .skip(2)
                .collect(toList());
        System.out.println(dishes2);
    }
}
