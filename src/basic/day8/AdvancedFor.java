package src.basic.day8;

public class AdvancedFor {
    public static void main(String[] args) {
        /*
        자바는 카운터 변수와 증감식을 사용하지 않고 항목의 개수만큼 반복하는 향상된 for 문이 존재한다
        for ( 타입변수 : 배열 ) {
            실행문;
        }
        for 문이 실행되면 배열 에서 가져올 항목이 있을 경우 타입변수에 항목을 저장하고 실행문을 실행한다 이것을 반복해서
        가져올 다음 항목이 없다면 for 문을 종료한다
         */
        int[] scores = {95, 71, 84, 93, 87};
        int sum = 0;

        for (int score : scores) {
            sum = sum + score;
        }

        System.out.println("점수 총합 = " + sum);

        double avg = (double) sum / scores.length;
        System.out.println("점수 평균 = " + avg);
    }
}
