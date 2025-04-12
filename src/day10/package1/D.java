package src.day10.package1;

public class D {
    public int field1;
    int field2;
    private int field3;

    public D() {
        // (같은) 클래스 내부일 경우 접근 제한자의 영향을 받지 않는다
        field1 = 1;
        field2 = 1;
        field3 = 1;

        method1();
        method2();
        method3();
    }

    // public 접근제한 메소드
    public void method1() {}

    // default 접근제한 메소드
    void method2() {}

    // private 접근제한 메소드
    private void method3() {}
}

