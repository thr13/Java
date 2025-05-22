package src.day38;

import java.util.Map;
import java.util.SequencedMap;
import java.util.TreeMap;

public class SequencedMapExample2 {
    public static void main(String[] args) {
        SequencedMap<Integer, String> map = new TreeMap<>();

        try {
            map.putFirst(3, "김자바"); // UnsupportedOperationException 예외 발생
        } catch (UnsupportedOperationException e) {
            System.err.println("UnsupportedOperationException 예외 발생");
        }

        map.put(3, "삼자바");
        map.put(2, "이자바");
        map.put(1, "일자바");
        map.put(5, "오시플");
        map.put(2, "이시플");
        map.put(4, "사시플");

        Map.Entry<Integer, String> firstEntry = map.firstEntry();
        System.out.println("첫 번쨰 엔트리: " + firstEntry.getKey() + ", " + firstEntry.getValue());

        firstEntry = map.pollFirstEntry();
        System.out.println("첫 번쨰 엔트리(제거): " + firstEntry.getKey() + ", " + firstEntry.getValue());

        Map.Entry<Integer, String> lastEntry = map.lastEntry();
        System.out.println("마지막 엔트리: " + lastEntry.getKey() + ", " + lastEntry.getValue());

        lastEntry = map.pollLastEntry();
        System.out.println("마지막 엔트리(제거): " + lastEntry.getKey() + ", " + lastEntry.getValue());

        System.out.println();

        for(Map.Entry<Integer, String> entry: map.sequencedEntrySet()) {
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }
        System.out.println();

        SequencedMap<Integer, String> reversedMap = map.reversed();
        for(int key: reversedMap.sequencedKeySet()) {
            System.out.println(key + ", " + reversedMap.get(key));
        }
    }
}
