package src.day12;

public class CarExample {
    public static void main(String[] args) {
        // Tire 클래스를 필드로 사용하는 Car 클래스 객체 생성
        Car myCar = new Car();

        // Tire 객체 생성
        myCar.tire = new Tire();

        myCar.run();

        // HankookTire 객체 (Tire 클래스의 자식클래스) - 자동타입변환
        myCar.tire = new HankookTire();
        myCar.run();

        // KumhoTire 객체 (Tire 클래스의 자식클래스) - 자동타입변환
        myCar.tire = new KumhoTire();
        myCar.run();

    }
}
