package src.day23;

public class Calculator {
    private int memory;

    public int getMemory() {
        return memory;
    }

    // 동기화 메소드
    public synchronized void setMemory1(int memory) {
        this.memory = memory;
        try {
            Thread.sleep(2000); // 2초 동안 정지 상태가 된다
        } catch (InterruptedException e) {

        }
        System.out.println(Thread.currentThread().getName() + ": " + this.getMemory()); // 해당 스레드 이름과 필드 값 출력
    }

    // 메소드 내부에 동기화 블럭 설정
    public void setMemory2(int memory) {
        // 아래의 this 는 이 메소드를 실행하는 객체를 가르킨다
        synchronized (this) {
            this.memory = memory;
            try {
                Thread.sleep(2000); // 2초 동안 정지 상태가 된다
            } catch (InterruptedException e) {

            }
            System.out.println(Thread.currentThread().getName() + ": " + this.getMemory()); // 해당 스레드 이름과 필드 값 출력
        }
    }
}
