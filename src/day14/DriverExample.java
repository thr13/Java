package src.day14;

public class DriverExample {
    public static void main(String[] args) {
        Driver driver = new Driver();

        // 구현체 객체 생성
        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        driver.drive(bus); // 인터페이스 구현체 대입(자동타입변환)
        driver.drive(taxi); // 인터페이스 구현체 대입(자동타입변환)
    }
}
