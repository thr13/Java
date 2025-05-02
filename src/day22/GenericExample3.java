package src.day22;

public class GenericExample3 {
    public static void main(String[] args) {
        HomeAgency homeAgency = new HomeAgency();
        Home home = homeAgency.rent();
        home.turnOnLight(); // 인터페이스 구현체인 HomeAgency 의 메소드가 실행됨

        CarAgency carAgency = new CarAgency();
        Car car = carAgency.rent();
        car.run(); // 인터페이스 구현체인 Car 의 메소드가 실행됨
    }
}
