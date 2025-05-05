package src.day24;

// 작업 스레드
public class PrintThread extends Thread {
    private boolean stop; // 스레드를 멈추는데 사용할 필드

    // 외부에서 stop 필드값을 변경하여 스레드를 제어하는 메소드
    public void setStop(boolean stop) {
        this.stop = stop;
    }

    @Override
    public void run() {
        // stop 필드값에 따라 반복 여부 결정
        while (!stop) {
            System.out.println("실행 중");
        }
        System.out.println("리소스 정리");
        System.out.println("실행 종료");
    }
}