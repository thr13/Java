package src.basic.day20;

public class GetClassExample {
    public static void main(String[] args) throws Exception {
        // Class 객체
        Class clazz1 = Car.class;
        System.out.println("패키지: " + clazz1.getPackage().getName());
        System.out.println("클래스 간단 이름: " + clazz1.getSimpleName());
        System.out.println("클래스 간단 이름: " + clazz1.getName());
        System.out.println();

        Class clazz2 = Class.forName("src.basic.day20.Car");
        System.out.println("패키지: " + clazz2.getPackage().getName());
        System.out.println("클래스 간단 이름: " + clazz2.getSimpleName());
        System.out.println("클래스 간단 이름: " + clazz2.getName());
        System.out.println();

        Car car = new Car();
        Class clazz3 = car.getClass();
        System.out.println("패키지: " + clazz3.getPackage().getName());
        System.out.println("클래스 간단 이름: " + clazz3.getSimpleName());
        System.out.println("클래스 간단 이름: " + clazz3.getName());
    }
}
