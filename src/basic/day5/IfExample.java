package src.basic.day5;

public class IfExample {
    public static void main(String[] args) {
        int score = 93;

        if (score >= 90) {
            System.out.println("점수가 90점 이상입니다");
        } else if (score >= 80) {
            System.out.println("점수가 80점 이상 그리고 90점 미만입니다");
        } else {
            System.out.println("점수가 80점 미만입니다");
        }
    }
}
