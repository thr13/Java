package src.intermediate.ch6;

import src.intermediate.ch4.Dish;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.*;
import static src.intermediate.ch4.Dish.menu;

public class StreamDivideExample1 {
    public static void main(String[] args) {
        // 모든 요리를 채식이 아닌 요리로 분류하기
        Map<Boolean, List<Dish>> partitionedMenu =
                menu.stream().collect(
                        partitioningBy(Dish::isVegetarian)
                );
        System.out.println(partitionedMenu);

        // Predicate 로 필터링한 다음 리스트에 결과를 수집
        List<Dish> vegetarianDishes = menu.stream().
                filter(Dish::isVegetarian)
                .collect(toList());
        System.out.println(vegetarianDishes);

        // 컬렉터를 두 번째 인수로 전달해서 표현
        Map<Boolean, Map<Dish.Type, List<Dish>>> vegetarianDishesByType = menu.stream()
                .collect(
                        partitioningBy(Dish::isVegetarian, groupingBy(Dish::getType))
                );
        System.out.println(vegetarianDishesByType);

        // 채식 요리와 채식 요리가 아닌 그룹에서 가장 칼로리가 높은 요리 찾기
        Map<Boolean, Dish> mostCaloricPartitionedByBegetarian = menu.stream()
                .collect(
                        partitioningBy(Dish::isVegetarian,
                                collectingAndThen(maxBy(comparingInt(Dish::getCalories)), Optional::get)
                        )
                );
        System.out.println(mostCaloricPartitionedByBegetarian);
    }
}
