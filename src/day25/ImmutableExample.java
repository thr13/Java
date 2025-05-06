package src.day25;

import java.util.*;

public class ImmutableExample {
    public static void main(String[] args) {
        List<String> immutableList1 = List.of("A", "B", "C"); //정적메소드 of() 를 이용해서 컬렉션을 수정할 수 없는 불변 컬렉션으로 만듦, 또다른 방법으로는 Arrays 의 asList() 메소드가 있다
        //immutableList1.add("D"); // 불변 컬렉션이므로 객체에 값을 추가할 수 없다

        Set<String> immutableSet1 = Set.of("A", "B", "C");
        //immutableSet1.remove("A"); // 불변 컬렉션이므로 객체에 값을 제거할 수 없다

        Map<Integer, String> immutableMap1 = Map.of(
                1, "A",
                2, "B",
                3, "C"
        );
        //immutableMap1.put(4, "D");

        // List 컬렉션을 copyOf() 메소드를 이용하여 불변 컬렉션으로 복사
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        List<String> immutableList2 = List.copyOf(list);
        //immutableList2.add("A");

        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        Set<String> immutableSet2 = Set.copyOf(set);
        //immutableSet2.add("D");

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        Map<Integer, String> immutableMap2 = Map.copyOf(map);
        //immutableMap2.put(4, "D");

        // 배열과 Arrays.asList()를 이용하여 List 불변 컬렉션 생성
        String[] arr = {"A", "B", "C"};
        List<String> immutableList3 = Arrays.asList(arr);
        //immutableList3.add("D");
    }
}
