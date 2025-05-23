package src.basic.day23;

/*
두 개의 스레드를 교대로 번갈아 가면서 실행하는 교대 작업이 필요한 경우
자신의 작업이 끝나면 상대방 스레드를 일시 정지 상태에서 풀어주고
자신의 스레드를 일시 정지 상태로 만들면 된다

각각의 스레드를 제어하기 위해선 공유 객체가 필요하다
아래 WorkObject 는 공유객체 이다
 */
public class WorkObject {
    // 동기화 메소드
    public synchronized void methodA() {
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName() + ": methodA 작업 실행");

        // 작업 끝 - 상대방 스레드를 풀어주고, 자신의 스레드를 일시 정지 상태로 만듦
        notify(); // 다른 스레드를 실행 대기 상태(RUNNABLE)로 만듦
        try {
            wait(); // 자신의 스레드는 일시 정지 상태로 만듦
        } catch (InterruptedException e) {

        }
    }

    public synchronized void methodB() {
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName() + ": methodB 작업 실행");
        notify();
        try {
            wait();
        } catch (InterruptedException e) {

        }
    }
}
