package src.day11;

public class SupersonicAirplaneExample {
    public static void main(String[] args) {
        SupersonicAirplane airplane = new SupersonicAirplane();
        airplane.takeOff();
        airplane.fly();

        airplane.flyMode = airplane.SUPERSONIC;
        airplane.fly();

        airplane.flyMode = airplane.NORMAL;
        airplane.fly();
        airplane.land();

    }
}
