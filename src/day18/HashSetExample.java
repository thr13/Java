package src.day18;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();

        Student s1 = new Student(1, "홍길동");
        hashSet.add(s1);
        System.out.println("저장된 객체 수(s1): " + hashSet.size());

        Student s2 = new Student(1, "홍길동");
        hashSet.add(s2);
        System.out.println("저장된 객체 수(s1,s2): " + hashSet.size()); // Student 클래스에서 hashCode() 를 오버라이드 하지 않으면 객체 번지로 해시코드를 생성하므로 객체가 다를 경우 해시코드도 달라진다 그러므로 다른 객체 취급된다

        Student s3 = new Student(2, "홍길동");
        hashSet.add(s3);
        System.out.println("저장된 객체 수(s1,s3): " + hashSet.size());
    }
}
