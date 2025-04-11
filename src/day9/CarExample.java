package src.day9;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.model = "그랜져";
        System.out.println("모델명: " + myCar.model);

        myCar.start = true;
        System.out.println("시동여부: " + myCar.start);

        myCar.speed = 60;
        System.out.println("현재속도: " + myCar.speed);

        Car yourCar = new Car("소나타", true, 70);
        System.out.println("모델명: " + yourCar.model);
        System.out.println("시동여부: " + yourCar.start);
        System.out.println("현재속도: " + yourCar.speed);
    }
}
