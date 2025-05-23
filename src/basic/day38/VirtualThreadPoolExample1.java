package src.basic.day38;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

// 작업 10000를 플랫폼 스레드와 가상 스레드로 처리 시간 비교
public class VirtualThreadPoolExample1 {
    public static void main(String[] args) throws Exception {
        // 스레드 작업 정의
        Runnable task = new Runnable() {
            @Override
            public void run() {
                try {
                    // 비블로킹 작업: 1 부터 1000까지 누적
                    long sum = 0;
                    for (int i = 0; i <= 1000; i++) {
                        sum += i;
                    }

                    // 블로킹 작업: I/O 작업이 10ms 있다고 가정
                    Thread.sleep(10);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };

        int taskNum = 10000; // 작업 건수

        // 플랫폼 스레드 100개를 풀링해서 사용하는 스레드풀
        ExecutorService threadExecutor = Executors.newFixedThreadPool(100);
        work(taskNum, task, threadExecutor);

        // 가상 스레드를 사용하는 스레드풀 생성
        ExecutorService virtualThreadPool = Executors.newVirtualThreadPerTaskExecutor();
        work(taskNum, task, virtualThreadPool);
    }

    private static void work(int taskNum, Runnable task, ExecutorService executorService) throws Exception {
        long start = System.nanoTime(); // 작업 시작 시간 측정

        // 작업 처리
        try (executorService) {
            for (int count = 0; count < taskNum; count++) {
                executorService.execute(task);
            }
        }

        // 모든 작업이 종료될때까지 기다림(최대 1시간)
        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.HOURS);

        long end = System.nanoTime(); // 작업 종료 시간 측정

        long workTime = end - start; // 작업 처리 시간 계산
        System.out.println("작업 처리 시간: " + workTime + " ns");
    }
}
