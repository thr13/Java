package src.basic.day18;

import java.io.IOException;

public class InExample {
    public static void main(String[] args) throws IOException {
        int speed = 0;
        int keyCode = 0;

        while(true) {
            // Enter 키를 읽지 않았을 경우에만 실행함
            if (keyCode != 13 && keyCode != 10) {

                if (keyCode == 49) {
                    // 숫자 1 키를 읽은 경우 실행됨
                    speed++;
                } else if (keyCode == 50) {
                    // 숫자 2 키를 읽은 경우 실행됨
                    speed--;
                } else if (keyCode == 51) {
                    // 숫자 3 키를 읽은 경우
                    break;
                }
                System.out.println("---------------------");
                System.out.println("1. 증속 | 2. 감속 | 3. 중지");
                System.out.println("---------------------");
                System.out.println("현재속도: " + speed);
                System.out.println("선택: ");
            }

            /*
            .read() 메소드는 호출과 동시에 키 코드를 읽는게 아니라 Enter 키를 누르기 전까지 대기 상태로 존재하다가 Enter 키를 누르면 입력했던 키들을 하나씩 읽는다
            그리고 .read() 메소드는 IOException 을 발생할 수 있으므로 예외처리가 필요함
            읽은 키들은 아스키코드 표에 정해진 정수값으로 변환된다
            */
            keyCode = System.in.read();
        }
        System.out.println("프로그램 종료");
    }
}
