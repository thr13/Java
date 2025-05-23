package src.basic.day11;

// 자식클래스
public class Child extends Parent{
    @Override
    public void method2() {
        System.out.println("부모클래스 메소드2 를 자식클래스에서 오버라이딩");
    }

    public void method3() {
        System.out.println("자식클래스 메소드3");
    }
}
