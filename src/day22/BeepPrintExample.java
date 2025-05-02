package src.day22;

import java.awt.*;

public class BeepPrintExample {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit(); // 운영체제의 기본적인 GUI 도구 모음(toolkit)

        for (int i=0; i<5; i++) {
            toolkit.beep(); // 사운드 재생
            try {
                Thread.sleep(500); // 0.5 초간 일시 정지
            } catch (InterruptedException e) {

            }
        }

        for (int i=0; i<5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(500); // 0.5 초간 일시 정지
            } catch (InterruptedException e) {

            }
        }

    }
}
