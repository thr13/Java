package src.basic.day5;

public class IfDice {
    public static void main(String[] args) {
        int num = (int)(Math.random() * 6) + 1;

        if (num == 1) {
            System.out.println("주사위 눈이 1이 나왔습니다");
        } else if (num == 2) {
            System.out.println("주사위 눈이 2가 나왔습니다");
        } else if (num == 3) {
            System.out.println("주사위 눈이 3가 나왔습니다");
        } else if (num == 4) {
            System.out.println("주사위 눈이 4가 나왔습니다");
        } else if (num == 5) {
            System.out.println("주사위 눈이 5가 나왔습니다");
        } else if (num == 6) {
            System.out.println("주사위 눈이 6이 나왔습니다");
        }
    }
}
