package src.day18;

public class RecordExample {
    public static void main(String[] args) {
        MemberRecord m = new MemberRecord("winter", "눈송이", 25);

        // record 의 Getter 메소드 호출
        System.out.println(m.id());
        System.out.println(m.name());
        System.out.println(m.age());

        System.out.println(m.toString());
        System.out.println();

        MemberRecord m1 = new MemberRecord("winter", "눈송이", 25);
        MemberRecord m2 = new MemberRecord("winter", "눈송이", 25);

        // record 는 오버라이드된 hashCode(), equals(), toString() 가 자동으로 추가된다
        System.out.println("m1.hashCode(): " + m1.hashCode());
        System.out.println("m2.hashCode(): " + m2.hashCode());
        System.out.println("m1.equals(m2): " + m1.equals(m2));
    }
}
