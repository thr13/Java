package src.intermediate.ch6;

import src.intermediate.ch4.Dish;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;
import static src.intermediate.ch4.Dish.menu;

public class StreamReducingExample {
    public static void main(String[] args) {
        // Collector 팩토리 메서드 counting() 을 이용한 메뉴에서 요리 수 계산1
        long howManyDishes1 = menu.stream().collect(Collectors.counting());
        System.out.println(howManyDishes1);

        // 메뉴에서 요리 수 계산2 - 불필요한 과정 생략
        long howManyDishes2 = menu.stream().count();
        System.out.println(howManyDishes2);

        // 스트림에서 최대값을 찾기 - Collectors.maxBy()
        Comparator<Dish> dishCaloriesComparator = Comparator.comparingInt(Dish::getCalories);
        Optional<Dish> mostCalorieDish = menu.stream().collect(maxBy(dishCaloriesComparator));
        System.out.println(mostCalorieDish);

        // 메뉴 리스트의 총 칼로리 계산하기 - 합계 요약 연산 summingInt
        int totalCalories = menu.stream().collect(summingInt(Dish::getCalories));
        System.out.println(totalCalories);

        // 메뉴 리스트의 평균 칼로리 계산하기 - 평균 요약 연산 averagingInt
        double averageCalories = menu.stream().collect(averagingInt(Dish::getCalories));
        System.out.println(averageCalories);

        // 하나의 요약 연산으로 메뉴에 있는 요소 수, 요리의 칼로리 합계, 평균, 최대값, 최소값 계산하기
        IntSummaryStatistics menuStatistics = menu.stream().collect(summarizingInt(Dish::getCalories));
        System.out.println(menuStatistics);

        // 메뉴의 모든 요리명 출력하기 - 컬렉터의 팩토리 메서드 joining()
        String shortMenu1 = menu.stream().map(Dish::getName).collect(joining());
        System.out.println(shortMenu1);
        // 문자열 구분 - 팩토리 메서드 joining("구분자")
        String shortMenu2 = menu.stream().map(Dish::getName).collect(joining(", "));
        System.out.println(shortMenu2);

        // 메뉴의 모든 칼로리 합계 계산하기 - reducing() 메서드로 만들어진 컬렉터
        int totalCalories2 = menu.stream().collect(reducing(0, Dish::getCalories, (i, j) -> i + j));
        System.out.println(totalCalories2);

        // 가장 칼로리가 높은 요리 찾기 - reducing()
        Optional<Dish> mostCalorieDish2 = menu.stream().collect(reducing((d1, d2) -> d1.getCalories() > d2.getCalories() ? d1 : d2));


    }
}
