package src.day38;

import java.util.ArrayList;
import java.util.SequencedCollection;

public class SequencedCollectionExample {
    public static void main(String[] args) {
        // 순서가 존재하는 중복 허용 컬렉션
        SequencedCollection<String> nameList = new ArrayList<>();

        // addFirst() 메소드로 첫 번째 요소로 저장
        nameList.addFirst("김자바");
        nameList.addFirst("이시플");
        nameList.addFirst("박이썬");

        // addList() 메소드로 마지막 요소로 저장
        nameList.addLast("최스트");
        nameList.addLast("황러터");
        nameList.addLast("오프링");

        nameList.removeFirst(); // 첫 번쨰 요소 제거
        nameList.removeLast(); // 마지막 요소 제거

        System.out.println(nameList); // 요소 출력, String 타입이므로 toString() 불필요

        nameList = nameList.reversed(); // 요소 순서 뒤집기
        System.out.println(nameList);
    }
}
