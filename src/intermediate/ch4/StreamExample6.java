package src.intermediate.ch4;

import java.util.List;

import static java.util.stream.Collectors.toList;
import static src.intermediate.ch4.Dish.menu;

public class StreamExample6 {
    public static void main(String[] args) {
        List<String> names = menu.stream()
                .filter(dish -> {
                    System.out.println("filtering:" + dish.getName());
                    return dish.getCalories() > 300;
                }) // 필터링한 요리명을 출력한다
                .map(dish -> {
                    System.out.println("mapping:" + dish.getName());
                    return dish.getName();
                }) // 추출한 요리명을 출력한다
                .limit(3)
                .collect(toList());
        System.out.println(names);
    }
}