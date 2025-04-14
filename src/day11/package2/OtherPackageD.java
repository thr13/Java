package src.day11.package2;

import src.day11.package1.ProtectedA;

/*
다른 패키지지만 상속으로 인해 protected 접근 가능
 */
public class OtherPackageD extends ProtectedA {

    // 기본생성자
    public OtherPackageD() {
        // super() 메소드를 이용하여 부모클래스의 생성자 호출 [생략가능]
        super();
    }

    public void method1() {
        // 부모 클래스의 필드, 메서드 접근 가능
        this.field = "value";
        this.method();
    }

    public void method2() {
        /*
        상속을 하더라도 protected 로 되어 있기 때문에 직접 객체를 생성해서 사용하는 것은 불가능하다
        ProtectedA a = new ProtectedA();
        a.filed = "value";
        a.method();
         */
    }
}
