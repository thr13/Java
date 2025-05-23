package src.basic.day5;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        /* while 문의 조건식이 false 가 아니라면 실행문을 반복함
        while(조건식) {
        실행문
        }
         */
        int i=1;
        while(i<=10){
            System.out.println(i + "번쨰 반복중");
            i++;
        }

        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int speed= 0;

        while (run){
            System.out.println("---");
            System.out.println("1.증속 2. 감속 3. 정지");
            System.out.println("---");
            System.out.print("선택: ");

            String strNum = scanner.nextLine();

            if(strNum.equals("1")){
                speed++;
            } else if(strNum.equals("2")){
                speed--;
            } else if(strNum.equals("3")){
                run = false;
            }
            System.out.println("현재 속도: " + speed);
        }
        System.out.println("프로그램 종료");
    }
}
