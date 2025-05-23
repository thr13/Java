package src.basic.day23;

public class YieldExample {
    public static void main(String[] args) {
        WorkThread workThreadA = new WorkThread("작업 스레드 A");
        WorkThread workThreadB = new WorkThread("작업 스레드 B");

        // 작업 스레드 A 와 B 는 번갈아 가면서 실행된다 (단일코어에서는 시간 분할 처리 방식을 가지고 있기 떄문)
        workThreadA.start();
        workThreadB.start();

        try {
            Thread.sleep(5000); // 5초동안 main 스레드 를 정지 상태로 만듦
        } catch (InterruptedException e) {

        }
        workThreadA.work = false; // 작업 스레드 A 의 필드를 false 로 변경해서 yield() 메소드 호출

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {

        }
        workThreadA.work = true; // 작업 스레드 A 를 다시 실행상태로 만듦
    }
}
