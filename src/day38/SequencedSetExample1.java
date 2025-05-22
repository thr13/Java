package src.day38;

import java.util.LinkedHashSet;
import java.util.SequencedSet;

public class SequencedSetExample1 {
    public static void main(String[] args) {
        // 순서가 존재하고 중복된 요소를 제거하는 컬렉션
        SequencedSet<String> nameSet = new LinkedHashSet<>();

        // addFirst() 메소드로 첫 번째 요소로 저장
        nameSet.addFirst("김자바");
        nameSet.addFirst("김자바");
        nameSet.addFirst("박이썬");

        // addList() 메소드로 마지막 요소로 저장
        nameSet.addLast("최스트");
        nameSet.addLast("황러터");
        nameSet.addLast("황러터");

        nameSet.removeFirst(); // 첫 번쨰 요소 제거
        nameSet.removeLast(); // 마지막 요소 제거

        System.out.println(nameSet); // 요소 출력, String 타입이므로 toString() 불필요

        nameSet = nameSet.reversed(); // 요소 순서 뒤집기
        System.out.println(nameSet);
    }
}
