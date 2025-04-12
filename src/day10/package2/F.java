package src.day10.package2;

import src.day10.package1.D;

public class F {
    public void method() {
        // 객체생성
        D d = new D();

        // 필드값 변경
        d.field1 = 2;
        // d.field2 = 2; //default 로 선언된 필드는 다른 패키지에 있을 경우 접근 불가
        // d.field3 = 2; //private 접근 불가

        // 메소드 호출
        d.method1();
        // d.method2(); //default 메소드 접근 불가
        // d.method3(); // private 메소드 접근 불가
    }
}
