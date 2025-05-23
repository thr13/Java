package src.basic.day10.package1;

public class E {
    public void method() {
        // 객체생성
        D d = new D();

        // 필드값 변경
        d.field1 = 2;
        d.field2 = 2;
        // d.field3 = 2; //private 로 선언된 필드는 같은 패키지라도 접근 불가

        // 메소드 호출
        d.method1();
        d.method2();
        // d.method3(); // private 메소드 접근 불가
    }
}
