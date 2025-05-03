package src.day23;

public class JoinExample {
    public static void main(String[] args) {
        SumThread sumThread = new SumThread();
        sumThread.start(); // 작업 스레드 시작
        try {
            sumThread.join(); // 작업 스레드인 sumThread 가 계산을 마칠떄까지 main 스레드를 일시 정지 상태로 만듦
        } catch (InterruptedException e) {

        }

        System.out.println("1 부터 100까지 합: " + sumThread.getSum());

    }
}
