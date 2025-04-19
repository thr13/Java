package src.day15;

public class AExample {
    public static void main(String[] args) {
        // A 객체 생성
        A a = new A();

        // B 객체 (중첩된 클래스) 생성 - B 객체를 A 클래스 외부에 생성하려면 default 이상의 접근 제한을 가져야 하며, 객체 A 를 생성한 다음 객체 B 를 생성해야한다
        A.B b = a.new B();
        System.out.println();

        // A 의 메소드 호출
        a.useB();
    }
}
