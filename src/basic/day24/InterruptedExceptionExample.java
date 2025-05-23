package src.basic.day24;

public class InterruptedExceptionExample {
    public static void main(String[] args) {
        Thread thread = new PrintThread2();
        thread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }
        thread.interrupt(); // 스레드의 InterruptedException 예외 발생
    }
}