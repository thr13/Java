package src.basic.day14;

public class SealedInterfaceExample {
    public static void main(String[] args) {
        // 구현체 객체 생성
        ImplClass impl = new ImplClass();

        // 봉인된 인터페이스 객체에 구현체 대입
        SealedInterfaceA ia = impl;
        ia.methodA(); // 자동타입변환(impl 객체가 SealedInterfaceA 으로 자동타입변환됨)
        System.out.println();

        // 봉인해제된 인터페이스 (상속을 받았으므로 부모 인터페이스의 메소드 호출 가능)
        SealedInterfaceB ib = impl;
        ib.methodA();
        ib.methodB(); // 자동타입변환(impl 객체가 SealedInterfaceB 으로 자동타입변환됨)
        System.out.println();

        // 봉인해제된 인터페이스를 상속받은 자식 인터페이스 -> 부모 인터페이스 구현체 모두 호출가능
        SealedInterfaceC ic = impl;
        ic.methodA();
        ic.methodB();
        ic.methodC();

    }
}
