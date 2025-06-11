package src.intermediate.ch6;

import src.intermediate.ch4.Dish;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.*;
import static src.intermediate.ch4.Dish.menu;

public class StreamGroupingExample {
    public static void main(String[] args) {
        // 팩토리 메서드 Collections.groupingBy 를 이용해서 메뉴를 그룹화하기
        Map<Dish.Type, List<Dish>> dishesByType = menu.stream().collect(groupingBy(Dish::getType));
        System.out.println(dishesByType);

        // 메서드 참조 대신 람다 표현식을 이용해서 칼리로 조건별 분류하기
        Map<CaloricLevel, List<Dish>> dishesByCaloricLevel = menu.stream().collect(
                groupingBy( dish -> {
                    if (dish.getCalories() <= 400)
                        return CaloricLevel.DIET;
                    else if (dish.getCalories() <= 700)
                        return CaloricLevel.NORMAL;
                    else
                        return CaloricLevel.FAT;
                }));
        System.out.println(dishesByCaloricLevel);

        // 그룹화 하기 전 Predicate 로 필터 적용하여 500 칼로리를 넘는 요리 추출하기
        Map<Dish.Type, List<Dish>> caloricDishesByType = menu.stream()
                .filter(dish -> dish.getCalories() > 500)
                .collect(groupingBy(Dish::getType));
        System.out.println(caloricDishesByType);

        // Collector 내부로 필터 Predicate 를 이동하기
        Map<Dish.Type, List<Dish>> caloricDishesByType2 = menu.stream()
                .collect(groupingBy(Dish::getType,
                        filtering(dish -> dish.getCalories() > 500, toList())
                ));
        System.out.println(caloricDishesByType2);

        // 각 요리를 관련 이름 목록으로 변환하기
        Map<Dish.Type, List<String>> dishNamesByType = menu.stream()
                .collect(groupingBy(Dish::getType
                        , mapping(Dish::getName, toList())
                ));
        System.out.println(dishNamesByType);
    }
}
