package src.day38;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SequencedMap;

public class SequencedMapExample1 {
    public static void main(String[] args) {
        // 순서가 존재하는 LinkedHashMap 생성
        SequencedMap<Integer, String> map = new LinkedHashMap<>();

        // 첫 번쨰 요소로 저장
        map.putFirst(1, "일자바");
        map.putFirst(2, "이자바");
        map.putFirst(3, "삼자바"); // 기존 요소 보다 제일 앞에 추가

        // 마지막 요소로 저장
        map.putLast(2, "이시플");
        map.putLast(4, "사시플");
        map.putLast(5, "오시플"); // 기존 요소 보다 제일 뒤에 추가

        // 첫 번쨰 엔트리 가져오기 (컬렉션에 엔트리가 남아있음)
        Map.Entry<Integer, String> firstEntry = map.firstEntry();
        System.out.println("첫 번쨰 엔트리: " + firstEntry.getKey() + ", " + firstEntry.getValue());

        // 첫 번쨰 엔트리를 가져오고 제거함
        firstEntry = map.pollFirstEntry();
        System.out.println("첫 번쨰 엔트리(제거): " + firstEntry.getKey() + ", " + firstEntry.getValue());

        // 마지막 엔트리 가져오기 (컬렉션에 엔트리가 남아있음)
        Map.Entry<Integer, String> lastEntry = map.lastEntry();
        System.out.println("마지막 엔트리: " + lastEntry.getKey() + ", " + lastEntry.getValue());

        // 마지막 엔트리를 가져오고 제거함
        lastEntry = map.pollLastEntry();
        System.out.println("마지막 엔트리(제거): " + lastEntry.getKey() + ", " + lastEntry.getValue());

        System.out.println();

        // 순서대로 엔트리 일괄 처리
        for(Map.Entry<Integer, String> entry: map.sequencedEntrySet()) {
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }
        System.out.println();

        // 엔트리 순서 뒤집기
        SequencedMap<Integer, String> reversedMap = map.reversed();

        for(int key: reversedMap.sequencedKeySet()) {
            System.out.println(key + ", " + reversedMap.get(key));
        }
    }
}
