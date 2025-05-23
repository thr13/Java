package src.basic.day12;

public class AbstractMethodExample {

    public static void animalSound(Animal animal) {
        animal.sound();
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();

        Cat cat = new Cat();
        cat.sound();

        // 매개변수 다형성 - 자동타입변환
        animalSound(new Dog());
        animalSound(new Cat());
    }
}
