package src.basic.day24;

// 1초 주기로 save() 메소드를 호출하는 작업 스레드
public class AutoSaveThread extends Thread {
    public void save() {
        System.out.println("작업 내용을 저장함");
    }

    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                break; // InterruptedException 예외가 발생할 경우 반복문 실행종료
            }
            save();
        }
    }
}
