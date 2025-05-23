package src.basic.day12;

/*
매개변수 다형성 - 메소드가 클래스타입의 매개변수를 가지고 있을 경우, 해당 클래스가 상속관계를 가지고 있을때, 부모객체 대신에 자식객체를 제공할 수 있다
이러면 부모클래스의 메소드를 호출할떄 자식클래스에서 오버라이드 된 경우, 자식클래스의 메소드가 호출된다 이걸 이용해서 매개변수의 다형성을 구현함
 */
public class DriverExample {

    public static void main(String[] args) {
        // Driver 객체 생성
        Driver driver = new Driver();

        // Vehicle 의 자식 클래스인 Bus 객체 생성
        Bus bus = new Bus();
        // Driver 객체의 메소드에 매개변수로 Bus 객체를 넘김
        driver.drive(bus);

        // Vehicle 의 자식 클래스인 Taxi 객체 생성
        Taxi taxi = new Taxi();
        // Driver 객체의 메소드에 매개변수로 Taxi 객체를 넘김
        driver.drive(taxi);
    }
}
