package src.day14;

public class InstanceofExample {
    public static void main(String[] args) {
        Taxi taxi = new Taxi();
        Bus bus = new Bus();

        ride(taxi);
        System.out.println();
        ride(bus);
    }

    // 인터페이스 타입의 매개변수를 받는 메소드
    public static void ride(Vehicle vehicle) {
        /*
        매개값이 특정 구현 객체일 경우 강제타입변환을 하고 싶다면 instanceof 연산자를 사용해야한다
        아래는 JAVA 11 버전 이하 에서 사용하는 방법이다
        // vehicle 에 대입된 객체가 인터페이스 구현체인 Bus 타입일 경우에만 Bus 로 강제타입변환을 시킨다
        if(vehicle instanceof Bus) {
            Bus bus = (Bus) vehicle;
            bus.checkFare();
        }
         */

        // JAVA 12 버전 부터 instanceof 연산 결과가 true 인 경우 우측 타입 변수를 가져다 사용할 수 있다
        if(vehicle instanceof Bus bus) {
            bus.checkFare();
        }

        vehicle.run();
    }
}
