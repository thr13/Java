package src.day10.package1;

public class A {
    A a1 = new A(true);
    A a2 = new A(1);
    A a3 = new A("문자열");

    // public 접근 제한
    public A(boolean b) {}

    // default 접근 제한
    A(int b) {}

    // private 접근 제한
    private A(String s) {}
}
