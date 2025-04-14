package src.day11.package2;

import src.day11.package1.ProtectedA;

/*
다른패키지 에 있기때문에 protected 필드, 생성자, 메소드 접근 불가능
 */
public class OtherPackageC {
    public void method() {
        /*
         ProtectedA a = new ProtectedA();
         a.field = "value";
         a.method();
         */
    }
}
