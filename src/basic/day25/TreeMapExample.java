package src.basic.day25;

import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        treeMap.put("apple", 10);
        treeMap.put("forever", 60);
        treeMap.put("description", 40);
        treeMap.put("ever", 50);
        treeMap.put("zoo", 80);
        treeMap.put("base", 20);
        treeMap.put("guess", 70);
        treeMap.put("cherry", 30);

        // 정렬된 엔트리
        Set<Entry<String, Integer>> entrySet = treeMap.entrySet();
        for(Entry<String, Integer> entry : entrySet) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
        System.out.println();

        Entry<String, Integer> entry = null;

        entry = treeMap.firstEntry(); // firstEntry() 메소드는 제일 낮은 Map.Entry 를 리턴
        System.out.println("제일 앞 단어: " + entry.getKey() + "-" + entry.getValue());

        entry = treeMap.lastEntry(); // lastEntry() 메소드는 제일 높은 Map.Entry 를 리턴
        System.out.println("제일 뒤 단어: " + entry.getKey() + "-" + entry.getValue());

        entry = treeMap.lowerEntry("ever"); // lowerEntry() 는 매개값으로 받은 키의 바로 아래 Map.Entry 를 리턴
        System.out.println("ever 앞 단어: " + entry.getKey() + "-" + entry.getValue() + "\n");

        // 내림차순으로 정렬
        NavigableMap<String, Integer> descendingMap = treeMap.descendingMap(); // descendingMap() 은 내림차순으로 정렬된 Map.Entry 의 NavigableMap 을 리턴
        Set<Entry<String, Integer>> descendingEntrySet = descendingMap.entrySet();
        for(Entry<String, Integer> e : descendingEntrySet) {
            System.out.println(e.getKey() + "-" + e.getValue());
        }
        System.out.println();

        // 단어 범위 검색
        System.out.println("[c-h 사이의 단어 검색]");
        NavigableMap<String, Integer> rangeMap = treeMap.subMap("c", true, "h", false); // 시작 키 와 끝 키 사이의 Map.Entry 들을 NavigableMap 컬렉션으로 반환함, fromInclusive 와 toInclusive 매개값에 따라서 동등 객체가 포함여부를 결정함
        for(Entry<String, Integer> e : rangeMap.entrySet()) {
            System.out.println(e.getKey() + "-" + e.getValue());
        }
    }
}
