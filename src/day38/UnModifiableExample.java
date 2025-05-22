package src.day38;

import java.util.ArrayList;
import java.util.Collections;
import java.util.SequencedCollection;

// 순차 컬렉션을 불변 복제 순차 컬렉션으로 만들기
public class UnModifiableExample {
    public static void method1() {
        // 순차 컬렉션
        SequencedCollection<String> collection = new ArrayList<>();

        collection.addFirst("데이터1");
        collection.addFirst("데이터2");
        collection.addFirst("데이터3");

        // unmodifiableSequencedCollection() 메소드로 불변 복제 컬렉션으로 변경
        method2(Collections.unmodifiableSequencedCollection(collection));
    }

    public static void method2(SequencedCollection<String> collection) {
        // 모든 요소 출력
        for(String data: collection) {
            System.out.println(data);
        }

        // 첫 번쨰 요소 제거시 UnsupportedOperationException 예외 발생)
        try {
            collection.removeFirst();
        } catch (UnsupportedOperationException e) {
            System.err.println("UnsupportedOperationException 예외 발생");
        }
    }

    public static void main(String[] args) {
        method1();
    }
}
