package src.intermediate.ch4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import static src.intermediate.ch4.Dish.menu;

public class StreamExample5 {
    public static void main(String[] args) {
        // 외부 반복1
        List<String> names = new ArrayList<>();
        for(Dish dish: menu) { // 리스트 menu 를 명시적으로 순차 반복한다
            names.add(dish.getName()); // 이름을 추출해서 리스트에 추가한다
        }
        System.out.println(names);

        // 외부 반복2
        List<String> names2 = new ArrayList<>();
        Iterator<Dish> iterator = menu.iterator();
        while(iterator.hasNext()) {
            Dish dish = iterator.next();
            names2.add(dish.getName());
        }
        System.out.println(names2);

        // 내부 반복
        List<String> names3 = menu.stream()
                .map(Dish::getName)// map() 메서드를 getName() 메서드로 파라미터화 해서 요리명을 추출한다 map((Dish dish) -> dish.getName())
                .collect(Collectors.toList());
        System.out.println(names3);
    }
}
