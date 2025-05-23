package src.basic.day38;

import java.util.SequencedSet;
import java.util.TreeSet;

public class SequencedSetExample2 {
    public static void main(String[] args) {
        // TreeSet 컬렉션 생성
        SequencedSet<String> nameSet = new TreeSet<>();

        try {
            nameSet.addFirst("김자바"); // 직접 순서를 지정하여 저장시 UnsupportedOperationException 예외 발생
        } catch (UnsupportedOperationException e) {
            System.err.println("UnsupportedOperationException 예외 발생 ");
        }

        // 요소 저장
        nameSet.add("김자바");
        nameSet.add("이시플");
        nameSet.add("김자바");
        nameSet.add("박이썬");
        nameSet.add("황러터");
        nameSet.add("박이썬");

        nameSet.removeFirst();
        nameSet.removeLast();
        System.out.println(nameSet);

        nameSet = nameSet.reversed(); // 요소 순서 뒤집기
        System.out.println(nameSet);
    }
}
