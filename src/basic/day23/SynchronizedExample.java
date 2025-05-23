package src.basic.day23;

public class SynchronizedExample {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        User1Thread user1Thread = new User1Thread();
        user1Thread.setCalculator(calculator); // 작업스레드가 필드로 가진 공용객체 Calculator 설정
        user1Thread.start();

        User2Thread user2Thread = new User2Thread(); // 작업스레드가 필드로 가진 공용객체 Calculator 설정
        user2Thread.setCalculator(calculator);
        user2Thread.start();
    }
}
