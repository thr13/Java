package src.basic.day3;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫번쨰 입력값 X: ");
        String strX = scanner.nextLine();
        int x = Integer.parseInt(strX);

        System.out.print("두번째 입력값 Y: ");
        String strY = scanner.nextLine();
        int y = Integer.parseInt(strY);

        int result = x+y;
        System.out.println("x + y = " + result);

        scanner.close();
    }
}
