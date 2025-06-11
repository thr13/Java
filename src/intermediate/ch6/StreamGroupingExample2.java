package src.intermediate.ch6;

import src.intermediate.ch4.Dish;

import java.util.*;

import static java.util.Arrays.asList;
import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.*;
import static src.intermediate.ch4.Dish.menu;

public class StreamGroupingExample2 {
    public static void main(String[] args) {
        Map<String, List<String>> dishTags = new HashMap<>();
        dishTags.put("pork", asList("greasy", "salty"));
        dishTags.put("beef", asList("salty", "roasted"));
        dishTags.put("chicken", asList("fried", "crisp"));
        dishTags.put("french fries", asList("greasy", "fried"));
        dishTags.put("rice", asList("light", "natural"));
        dishTags.put("season fruit", asList("fresh", "natural"));
        dishTags.put("pizza", asList("tasty", "salty"));
        dishTags.put("prawns", asList("tasty", "roasted"));
        dishTags.put("salmon", asList("delicious", "fresh"));

        // flatMap 을 이용하여 태그 목록 추출
        Map<Dish.Type, Set<String>> dishNamesByType = menu.stream()
                .collect(groupingBy(Dish::getType,
                        flatMapping(dish -> dishTags.get(dish.getName()).stream(), toSet())));
        System.out.println(dishNamesByType);

        // 바깥쪽 groupingBy 에 내부 groupingBy 를 전달해서 두 수준으로 스트림의 항목 그룹화하기(다수준 그룹화)
        Map<Dish.Type, Map<CaloricLevel, List<Dish>>> dishesByTypeCaloricLevel = menu.stream()
                .collect(
                        groupingBy(Dish::getType, // 바깥쪽 grouping - 첫 번째 수준의 분류 함수
                                groupingBy(dish -> { // 내부 grouping - 두 번째 수준의 분류 함수
                                    if (dish.getCalories() <= 400){
                                        return CaloricLevel.DIET;
                                    } else if (dish.getCalories() <= 700){
                                        return CaloricLevel.NORMAL;
                                    } else {
                                        return CaloricLevel.FAT;
                                    }
                                })
                        )
                );
        System.out.println(dishesByTypeCaloricLevel);

        // groupingBy 컬렉터에 두 번째 인수로 counting 컬렉터를 전달해서 메뉴 요리의 수를 종류별로 게산하기
        Map<Dish.Type, Long> typesCount = menu.stream()
                .collect(groupingBy(Dish::getType, counting()));
        System.out.println(typesCount);

        // 요리의 종류를 분류하는 컬렉터를 이용해 메뉴에서 가장 높은 칼로리를 가진 요리 찾기
        Map<Dish.Type, Optional<Dish>> mostCaloricDishes = menu.stream()
                .collect(
                        groupingBy(Dish::getType,
                                maxBy(comparingInt(Dish::getCalories)))
                );
        System.out.println(mostCaloricDishes);

        // 바로 위 예제의 결과에서 collectingAndThen 를 이용하여 Optional 로 감싼걸 풀기
        Map<Dish.Type, Dish> mostCaloricDishes2 = menu.stream()
                .collect(
                        groupingBy(Dish::getType, // 분류함수
                                collectingAndThen(
                                        maxBy(comparingInt(Dish::getCalories)), // 감싸인 컬렉터
                                Optional::get)) // 변환 함수
                );
        System.out.println(mostCaloricDishes2);

        // groupingBy 에 사용된 컬렉터 재사용하기
        Map<Dish.Type, Integer> totalCaloriesByType = menu.stream().collect(
                groupingBy(Dish::getType, // 첫 번째 컬렉터
                        summingInt(Dish::getCalories) // 두 번째 컬렉터
        ));
        System.out.println(totalCaloriesByType);

        // 각 요리 형식에 존재하는 모든 CaloricLevel 값을 출력하기
        Map<Dish.Type, Set<CaloricLevel>> caloricLevelsByType =
                menu.stream().collect(
                        groupingBy(Dish::getType, mapping(dish -> {
                            if (dish.getCalories() <= 400){
                                return CaloricLevel.DIET;
                            } else if (dish.getCalories() <= 700){
                                return CaloricLevel.NORMAL;
                            } else {
                                return CaloricLevel.FAT;
                            }
                        }, toSet())
                        )
                );
        System.out.println(caloricLevelsByType);

        // toCollection 에 HashSet 인스턴스 전달하기
        Map<Dish.Type, Set<CaloricLevel>> caloricLevelsByType2 = menu.stream()
                .collect(
                        groupingBy(Dish::getType, mapping(dish -> {
                            if (dish.getCalories() <= 400){
                                return CaloricLevel.DIET;
                            } else if (dish.getCalories() <= 700){
                                return CaloricLevel.NORMAL;
                            } else {
                                return CaloricLevel.FAT;
                            }
                        }, toCollection(HashSet::new))
                    )
                );
        System.out.println(caloricLevelsByType2);
    }
}
