package src.day9;

public class Car {
    String model;
    boolean start;
    int speed;

    Car() {}

    Car(String model) {
        this(model, true, 100);
    }

    Car(String model, boolean start) {
        this(model, start, 100);
    }

    Car(String model, boolean start, int speed) {
        this.model = model;
        this.start = start;
        this.speed = speed;
    }
}
