package src.day14;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.run();

        // 인터페이스의 구현체 를 다른 객체로 교체함
        myCar.tire1 = new KumhoTire();
        myCar.tire2 = new KumhoTire();

        myCar.run(); // 다른 구현체의 메소드가 실행됨 (다형성)
    }
}
