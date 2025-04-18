package src.day14;

public class Bus implements Vehicle {

    // 인터페이스의 추상메소드를 구현
    @Override
    public void run() {
        System.out.println("버스가 달립니다");
    }

    public void checkFare() {
        System.out.println("승차요금을 확인합니다");
    }
}
