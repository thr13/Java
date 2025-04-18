package src.day14;

public class ExtendsExample {
    public static void main(String[] args) {
        // 자식 인터페이스 구현 객체
        InterfaceCImpl impl = new InterfaceCImpl();

        // 부모 인터페이스에 자식 인터페이스 구현 객체 대입
        InterfaceA ia = impl;
        ia.methodA();
        // ia.methodB(); // 대입되지 않은 부모 인터페이스의 메소드는 사용불가
        System.out.println();

        // 부모 인터페이스에 자식 인터페이스 구현 객체 대입
        InterfaceB ib = impl;
        // ib.methodA();
        ib.methodB();
        System.out.println();

        // 자식 인터페이스에서 오버라이드한 추상메소드 호출 가능
        InterfaceC ic = impl;
        ic.methodA();
        ic.methodB();
        ic.methodC();
    }
}
