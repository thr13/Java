package src.basic.day28;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExample {
    public static void main(String[] args) {
        List<Student2> totalList = new ArrayList<>();

        totalList.add(new Student2("홍길동", "남", 92));
        totalList.add(new Student2("김수영", "여", 87));
        totalList.add(new Student2("김자바", "남", 95));
        totalList.add(new Student2("오해영", "여", 93));


        /*
        남학생만 수집해서 새 List 생성
        List<Student2> maleList = totalList.stream()
                .filter(s -> s.getSex().equals("남"))
                .collect(Collectors.toList());
         */

        // 남학생만 수집해서 새 List 생성 - JAVA 16 이상 표현방법
        List<Student2> maleList = totalList.stream()
                .filter(s -> s.getSex().equals("남"))
                .toList();

        maleList.stream()
                .forEach(s -> System.out.println(s.getName()));
        System.out.println();

        Map<String, Integer> map = totalList.stream()
                .collect(
                        Collectors.toMap(
                                s -> s.getName(),
                                s -> s.getScore()
                        )
                );
        System.out.println(map);
    }
}
