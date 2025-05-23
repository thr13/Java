package src.basic.day14;

/*
인터페이스를 이용한 필드 다형성을 구현할 클래스
 */
public class Car {
    // 인터페이스 변수에 구현 객체를 대입(자동타입변환)
    Tire tire1 = new HankookTire();
    Tire tire2 = new HankookTire();

    void run() {
        tire1.roll(); // 인터페이스에 선언된 추상 메소드를 호출함 -> 이떄, 추상메소드를 오버라이드 한 구현 객체의 메소드 호출
        tire2.roll();
    }
}
