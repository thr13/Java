package src.day23;

public class ThreadNameExample {
    public static void main(String[] args) {
        // 현재 코드를 실행하는 스레드 객체 참조 얻기
        Thread mainThread = Thread.currentThread();
        System.out.println(mainThread.getName() + " 실행"); // 메인 스레드 이름 출력

        for (int i=0; i<3; i++) {
            Thread threadA = new Thread() {
                @Override
                public void run() {
                    System.out.println(getName() + " 실행"); // 현재 실행중인 작업 스레드 이름 출력
                }
            };
            threadA.start();
        }

        Thread chatThread = new Thread() {
            @Override
            public void run() {
                System.out.println(getName() + " 실행");
            }
        };
        chatThread.setName("채팅스레드"); // 작업 스레드 이름 변경
        chatThread.start();
    }
}
