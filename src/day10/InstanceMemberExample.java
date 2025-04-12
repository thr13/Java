package src.day10;

public class InstanceMemberExample {
    public static void main(String[] args) {
        /*
        인스턴스 멤버(Instance Member)란, 객체에 소속된 멤버를 의미한다 즉, 객체를 생성해야만 사용할 수 있는 멤버 이다
        덤으로 정적 멤버(Static Member)란, 클래스에 고정된 멤버를 의미하고 이것은 객체 없이도 사용할 수 있는 멤버를 의미한다
         */

        Car myCar = new Car(); // Car 클래스의 필드와 메서드를 사용하기 위해서는 Car 객체를 먼저 생성하고 참조 변수로 접근해서 사용해야 한다
        myCar.gas = 10; // 필드 gas 는 객체마다 따로 존재함 (필드는 힙 영역에 존재)

        myCar.setSpeed(10); // 메서드 setSpeed()는 각 객체마다 존재하지 않고 메소드 영역(스택, 힙 영역과 다른 별도의 영역)에 저장되고 공유된다
        myCar.model = "버기";
        myCar.run();
    }
}

class Car {
    int gas;
    String model;
    int speed;

    Car () {}

    Car(String model) {
        this.model = model;
    }

    void setSpeed(int speed) {
        this.speed = speed; // 객체 내부에서 인스턴스 멤버(speed) 에 접근하기 위해 this 키워드를 사용한다
    }

    void run() {
        this.setSpeed(this.speed);
        System.out.println(this.model + "가 달립니다.(시속:" + this.speed + "km/h)");
    }
}
