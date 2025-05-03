package src.day23;

// 작업 스레드 A
public class ThreadA extends Thread {
    private WorkObject workObject; // 동기화 메소드를 가지고 스레드를 관리할 공유객체 WorkObject 를 필드로 가짐

    public ThreadA(WorkObject workObject) {
        setName("ThreadA");
        this.workObject = workObject;
    }

    @Override
    public void run() {
        for(int i=0; i<10; i++) {
            workObject.methodA(); // 동기화 메소드 호출
        }
    }
}
