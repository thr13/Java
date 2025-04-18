package src.day14;

/*
인터페이스는 다른 인터페이스를 다중상속이 가능함
자식 인터페이스의 구현 클래스는 부모 인터페이스와 자식 인터페이스의 모든 추상 메소드를 오버라이드 해야됨
자식 인터페이스 구현 객체는 부모 인터페이스 변수에 대입이 가능함 이 경우 자식 & 부모 인터페이스의 추상 메소드 호출가능
그러나 부모 인터페이스 변수에 대입된 경우 부모 인터페이스에 선언된 추상 메소드만 호출 가능
 */
public class InterfaceCImpl implements InterfaceC {
    public void methodA() {
        System.out.println("InterfaceCImpl-methodA() 실행");
    }

    public void methodB() {
        System.out.println("InterfaceCImpl-methodB() 실행");
    }

    public void methodC() {
        System.out.println("InterfaceCImpl-methodC() 실행");
    }
}
