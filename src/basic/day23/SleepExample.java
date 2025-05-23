package src.basic.day23;

import java.awt.Toolkit;

public class SleepExample {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        for(int i=0; i<10; i++) {
            toolkit.beep();
            try {
                Thread.sleep(3000); // 3초간 스레드를 일시정지상태로 만듦
            } catch (InterruptedException e) {

            }
        }
    }
}
