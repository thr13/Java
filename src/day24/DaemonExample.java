package src.day24;

public class DaemonExample {
    public static void main(String[] args) {
        AutoSaveThread autoSaveThread = new AutoSaveThread();
        autoSaveThread.setDaemon(true); // AutoSaveThread 작업 스레드를 데몬 스레드로 만듦

        autoSaveThread.start(); // 데몬스레드 작업 시작

        try {
            Thread.sleep(3000); // 주 스레드인 main 스레드를 일시정지 상태로 만듦
        } catch (InterruptedException e) {

        }
        System.out.println("메인 스레드 종료"); // 주 스레드인 main 스레드 종료시 데몬 스레드 AutoSaveThread 도 같이 종료
    }
}
