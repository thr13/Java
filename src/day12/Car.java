package src.day12;

public class Car {
    /*
    필드 다형성 : 이 클래스와는 별도로 상속관계를 가자고 있는 클래스를 필드로 가지면, 해당 클래스의 자식 클래스들이 자동타입변환 과 메소드 오버라이딩을 통해 다른 기능(메소드) 다형성 개념을 구현할 수 있다
     */
    public Tire tire;

    public void run() {
        tire.roll();
    }
}
