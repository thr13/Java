package src.day5;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        /*
        기본적으로 while 문과 비슷하나 do-while 문은 do 다음에 나올 실행문을 한번 동작한 후에 조건식을 판별한다
        do {
        실행문;
        } while (조건식);
         */
        System.out.println("메시지를 입력하세요");
        System.out.println("프로그램을 종료할려면 q 를 눌러주세요");

        Scanner scanner = new Scanner(System.in);
        String message;

        do {
            System.out.print("> ");
            message = scanner.nextLine();
            System.out.println(message);
        } while (!message.equals("q"));

    }
}
