package src.day27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlatMappingExample {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("This is Java");
        list1.add("I am a best developer");

        // 문장 스트림을 단어 스트림으로 변환
        list1.stream()
                .flatMap(data -> Arrays.stream(data.split(" "))) // stream() 메소드로 String[] 배열을 Stream<String> 으로 만듦
                .forEach(word -> System.out.println(word));
        System.out.println();

        // 문자열 숫자 목록 스트림을 숫자 스트림을 변환
        List<String> list2 = Arrays.asList("10, 20, 30, 40, 50");
        list2.stream()
                .flatMapToInt(data -> { // String[] 배열을 int[] 배열로 만듦
                    String[] strArr = data.split(","); // 쉼표(,) 기준으로 문자열을 분리
                    int[] intArr = new int[strArr.length];
                    for (int i = 0; i < strArr.length; i++) {
                        intArr[i] = Integer.parseInt(strArr[i].trim()); // 문자열을 int 형으로 변환
                    }
                    return Arrays.stream(intArr); // int[] 배열을 intStream 으로 만듦
                })
                .forEach(num -> System.out.println(num));
    }
}
