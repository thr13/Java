package src.basic.day24;

public class InterruptedExceptionExample2 {
    public static void main(String[] args) {
        Thread thread = new PrintThread3();
        thread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("InterruptedException 발생");
        }
        thread.interrupt(); // 현재 실행중인 작업 스레드의 interrupt() 메소드 호출
    }
}
