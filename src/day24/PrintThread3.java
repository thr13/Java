package src.day24;

public class PrintThread3 extends Thread {
    public void run() {
        while(true) {
            System.out.println("실행 중");
            // interrupt() 메소드 호출시 while 문 탈출
            if(Thread.interrupted()) {
                break;
            }
        }
        System.out.println("리소스 정리");
        System.out.println("실행 종료");
    }
}