package src.basic.day24;

public class SafeStopExample {
    public static void main(String[] args) {
        PrintThread printThread = new PrintThread();
        printThread.start(); // 작업 스레드 시작

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

        }
        printThread.setStop(true); // 스레드를 종료하기 위해 stop 필드값을 변경하는 메소드 호출
    }
}
