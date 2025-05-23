package src.basic.day24;

public class PrintThread2 extends Thread {
    public void run() {
        try {
            while(true) {
                System.out.println("실행 중");
                /*
                스레드는 실행대기(Runnable) 또는 실행(Running) 상태일때 interrupt() 메소드가 호출되어도 InterruptedException 이 발생하지 않는다
                그러나 스레드가 일지정지상태 가 된 경우 InterruptedException 예외가 발생한다
                 */
                Thread.sleep(1); // 스레드를 일시정지상태로 변경 -> InterruptedException 예외발생
            }
        } catch (InterruptedException e) {
            System.out.println("PrintThread2 클래스의 예외발생"); // 예외발생시 run 메소드 종료
        }
        System.out.println("리소스 정리");
        System.out.println("실행 종료");
    }
}
