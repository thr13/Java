package src.basic.day20;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {
    // 복권 당첨 프로그램
    public static void main(String[] args) {
        // Random 클래스를 이용해서 6개 번호 선택
        int[] selectNumber = new int[6];
        Random random = new Random(5);
        System.out.println("선택번호: ");

        for(int i=0; i<6; i++) {
            selectNumber[i] = random.nextInt(45) + 1;
            System.out.println(selectNumber[i] + " ");
        }
        System.out.println();

        // Random 클래스를 이용해서 당첨범호 6개 선택
        int[] winningNumber = new int[6];
        random = new Random(5);
        System.out.println("당첨번호: ");

        for(int i=0; i<6; i++) {
            winningNumber[i] = random.nextInt(45) + 1;
            System.out.println(winningNumber[i] + " ");
        }
        System.out.println();

        // 배열 정렬후 equals() 를 이용하여 배열값 비교
        Arrays.sort(selectNumber); // 선택번호 정렬
        Arrays.sort(winningNumber); // 당첨번호 정렬
        boolean result = Arrays.equals(selectNumber, winningNumber);
        System.out.println("당첨여부: ");

        if (result) {
            System.out.println("1등에 당첨되었습니다");
        } else {
            System.out.println("당첨되지 않았습니다");
        }
    }
}
