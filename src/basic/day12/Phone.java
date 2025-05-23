package src.basic.day12;

/*
추상 클래스는 공통적인 필드, 메소드를 추출해서 선언한 클래스 이다
추상 클래스는 새로운 실체 클래스를 만들기 위해 부모 클래스로만 사용되므로 extends 뒤에만 올 수 있다
추상 클래스는 new 연산자를 사용해서 객체를 직접 생성할 수 없다 또한, 상속을 통해 자식 클래스만 만들 수 있다
 */
public abstract class Phone {
    String owner;

    // 추상클래스는 자식객체가 생성될때 super() 로 추상클래스의 생성자가 호출되기 때문에 생성자가 반드시 존재해야한다
    public Phone(String owner) {
        this.owner = owner;
    }

    // 추상 클래스도 필드와 메소드를 선언할 수 있다
    void turnOn() {
        System.out.println("핸드폰 전원을 켭니다");
    }

    void turnOff() {
        System.out.println("핸드폰 전원을 끕니다");
    }
}
