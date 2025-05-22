package src.day38;

public class VirtualThreadPoolExample3 {
    public static void main(String[] args) {
        // 기존 방식
        Thread platformThread1 = new Thread(() -> {
            System.out.println("platformThread1 실행: ");
        });
        platformThread1.start();

        // 자바 21 버전 플랫폼 스레드 생성1
        Thread.ofPlatform()
                .start(()->{
                    System.out.println("platformThread2 실행: ");
                });

        // 자바 21 버전 플랫폼 스레드 생성2
        Thread.ofPlatform()
                .name("copyThread")
                .start(() -> {
                    System.out.println("platformThread3 실행: ");
                });

        // 자바 21 버전 플랫폼 스레드 생성3
        Thread platformThread4 = Thread.ofPlatform()
                .name("downloadThread")
                .daemon()
                .start(() -> {
                    System.out.println("platformThread4 실행: ");
                });
        System.out.println("platformThread4 이름: " + platformThread4.getName());
    }
}
