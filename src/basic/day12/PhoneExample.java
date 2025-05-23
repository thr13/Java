package src.basic.day12;

public class PhoneExample {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("홍길동");

        smartPhone.turnOn(); // 추상클래스의 메소드
        smartPhone.internetSearch();
        smartPhone.turnOff(); // 추상클래스의 메소드
    }
}
