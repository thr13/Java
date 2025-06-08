package src.intermediate.ch5;

import src.intermediate.ch4.Dish;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;
import static src.intermediate.ch4.Dish.menu;

public class StreamMappingExample {
    public static void main(String[] args) {
        // map() 메소드의 인수로 Dish 클래스의 getName() 메소드를 전달해서 스트림의 각 요소에 getName()를 적용한 새 스트림 요소 추출
        List<String> dishNames = menu.stream()
                .map(Dish::getName)
                .collect(toList());
        System.out.println(dishNames);

        // 단어 리스트에서 각 단어의 글자 수의 리스트를 반환
        List<String> words = Arrays.asList("Modern", "Java", "In", "Action");
        List<Integer> wordLengths = words.stream()
                .map(String::length)
                .collect(toList());
        System.out.println(wordLengths);

        // 요리명의 길이를 추출하여 리스트로 반환
        List<Integer> dishNameLengths = menu.stream()
                .map(Dish::getName)
                .map(String::length)
                .collect(toList());
        System.out.println(dishNameLengths);
    }
}
