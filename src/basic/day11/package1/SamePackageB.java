package src.basic.day11.package1;

/*
같은 패키지내 존재하기 때문에 protected 에 접근 가능
 */
public class SamePackageB {

    public void method() {
        ProtectedA a = new ProtectedA();
        a.field = "value";
        a.method();
    }
}
