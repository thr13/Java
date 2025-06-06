package src.intermediate.ch4;

import java.util.List;

import static java.util.stream.Collectors.toList;
import static src.intermediate.ch4.Dish.menu;

public class StreamExample3 {
    public static void main(String[] args) {
        List<String> threeHighCaloricDishNames = menu.stream() // menu 에서 스트림을 얻는다
                .filter(dish -> dish.getCalories() > 300) // 파이프라인 연산(고칼로리 필터링)
                .map(Dish::getName) // 파이프라인 연산(요리명 추출)
                .limit(3) // 파이프라인 연산(선착순 3개 선택)
                .collect(toList()); // 결과를 다른 리스트에 저장
        System.out.println(threeHighCaloricDishNames); // [pork, beef, chicken] 출력
    }
}
