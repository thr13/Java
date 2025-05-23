package src.basic.day25;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample2 {
    public static void main(String[] args) {
        Set<Member> set = new HashSet<>();

        set.add(new Member("홍길동", 30));
        System.out.println("hashCode: " + set.hashCode() );
        System.out.println("equals: " + set.equals(set) );
        System.out.println();

        set.add(new Member("홍길동", 30)); // Member 인스턴스는 다르지만 동등 객체이므로 중복 저장하지 않고 무시됨
        System.out.println("hashCode: " + set.hashCode() );
        System.out.println();

        System.out.println("총 객체 수: " + set.size());
    }
}
