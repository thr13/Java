package src.intermediate.ch1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FilteringApples {
    public static void main(String[] args) {
        // Apple 객체를 리스트로 생성
        List<Apple> inventory = Arrays.asList(
                new Apple(80, "green"),
                new Apple(155, "green"),
                new Apple(120, "red")
        );

        // 메서드 참조 사용

        // [Apple{color='green', weight=80}, Apple{color='green', weight=155}]
        List<Apple> greenApples = filterApples(inventory, FilteringApples::isGreenApple);
        System.out.println(greenApples);

        // [Apple{color='green', weight=155}]
        List<Apple> heavyApples = filterApples(inventory, FilteringApples::isHeavyApple);
        System.out.println(heavyApples);

        // 익명함수 또는 람다 사용

        // [Apple{color='green', weight=80}, Apple{color='green', weight=155}]
        List<Apple> greenApples2 = filterApples(inventory, (Apple a) -> "green".equals(a.getColor()));
        System.out.println(greenApples2);

        // [Apple{color='green', weight=155}]
        List<Apple> heavyApples2 = filterApples(inventory, (Apple a) -> a.getWeight() > 150);
        System.out.println(heavyApples2);

        // []
        List<Apple> weirdApples = filterApples(inventory, (Apple a) -> a.getWeight() < 80 || "brown".equals(a.getColor()));
        System.out.println(weirdApples);
    }

    // 필터 GreenApples
    public static List<Apple> filterGreenApples(List<Apple> inventory) {
        // 결과를 담을 List<> 생성
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if ("green".equals(apple.getColor())) {
                result.add(apple);
            }
        }
        return result;
    }

    // 필터 HeavyApples
    public static List<Apple> filterHeavyApples(List<Apple> inventory) {
        // 결과를 담을 List<> 생성
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (apple.getWeight() > 150) {
                result.add(apple);
            }
        }
        return result;
    }

    // color 필드의 값이 green 인지 확인
    public static boolean isGreenApple(Apple apple) {
        return "green".equals(apple.getColor());
    }

    // weight 필드의 값이 150 을 넘는지 확인
    public static boolean isHeavyApple(Apple apple) {
        return apple.getWeight() > 150;
    }

    // 사과가 제시하는 조건에 맞는지 확인
    public static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> p) {
        // 결과를 담을 List<> 생성
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (p.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }
}
