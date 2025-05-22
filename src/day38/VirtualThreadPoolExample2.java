package src.day38;

public class VirtualThreadPoolExample2 {
    public static void main(String[] args) {
        // 가상 스레드 생성 방법1 - 람다식으로 작성된 Runnable 구현 객체를 매개값으로 startVirtualThread() 메소드 호출
        Thread.startVirtualThread(() -> {
            System.out.println("virtualThread1 실행");
        });

        // 가상 스레드 생성 방법2 - 빌더 객체 생성후 start() 메소드 호출
        Thread.ofVirtual()
                .start(() -> {
                    System.out.println("virtualThread2 실행");
                });

        // 가상 스레드 이름 설정
        Thread virtualThread3 = Thread.ofVirtual()
                .name("downloadThread")
                .start(() -> {
                    System.out.println("virtualThread3 실행 ");
                });
        System.out.println("virtualThread3 이름: " + virtualThread3.getName());
    }
}
