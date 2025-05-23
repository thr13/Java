package src.basic.day14;

/*
강제타입변환은 캐스팅 기호 () 를 사용해서 인터페이스 타입을 구현 클래스 타입으로 변화시키는 것을 의미한다
구현 객체가 인터페이스 타입으로 자동타입변환되면 인터페이스에 선언된 메소드만 사용 가능하다
그러나 자동타입변환 후에 구현체 내부에 선언된 메소드를 호출할려면 캐스팅 기호 () 를 사용해서 원래의 구현 객체 타입으로 강제타입변환을 해야한다
 */
public class CastingExample {
    public static void main(String[] args) {
        // 인터페이스 변수 선언 및 구현 객체 대입
        Vehicle vehicle = new Bus();

        vehicle.run();
        // vehicle.checkFare(); // 자동타입변환(Promotion) 은 인터페이스의 추상메소드가 아닐 경우 호출이 불가능하다

        // 강제타입변환
        Bus bus = (Bus) vehicle;
        bus.run();
        bus.checkFare(); // (구현클래스 타입) 으로 캐스팅을 하게 되면 강제타입변환이 발생해 인터페이스의 추상메소드 뿐만 아니라 구현체 내부의 메소드도 호출이 가능하다
    }
}
