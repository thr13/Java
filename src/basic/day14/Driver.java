package src.basic.day14;

/*
매개변수 다형성을 구현할 클래스
 */
public class Driver{

    // 매개값으로 인터페이스 객체를 받는다 -> 인터페이스 객체 자리에 구현체를 넣을 수 있다(자동타입변환)
    void drive(Vehicle vehicle) {
        vehicle.run();
    }
}
