package src.day24;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {
    public static void main(String[] args) {
        // 스레드 풀 생성
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        // 스레드 풀 종료
        executorService.shutdown();
    }
}