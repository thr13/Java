package src.basic.day22;

import java.awt.Toolkit;

public class BeepPrintExample3 {
    public static void main(String[] args) {
        // Thread 의 익명 자식 객체로 작업 스레드 생성
        Thread thread = new Thread() {
            @Override
            public void run() {
                Toolkit toolkit = Toolkit.getDefaultToolkit(); // 운영체제의 기본적인 GUI 도구 모음(toolkit)

                for (int i=0; i<5; i++) {
                    toolkit.beep(); // 사운드 재생
                    try {
                        Thread.sleep(500); // 0.5 초간 일시 정지
                    } catch (InterruptedException e) {

                    }
                }
            }
        };

        thread.start(); // 작업 스레드 실행

        for (int i=0; i<5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(500); // 0.5 초간 일시 정지
            } catch (InterruptedException e) {

            }
        }
    }
}
