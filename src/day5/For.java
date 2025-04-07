package src.day5;

public class For {
    public static void main(String[] args) {
        /*
        for( 초기화식; 조건식; 증감식) {
            실행문;
        }
        초기화식이 제일 먼저 실행된 후, 다음 조건식을 평가해서 true 인 경우 실행문을 실행시키고 조건식이 false 인 경우 for 문을 종료시킴
        실행문 -> 증감식 -> 조건식 을 반복해서 실행함
        초기화식, 조건식, 증감식 각각 식이 둘 이상 존재 가능하며 구분에 , 를 사용한다
         */
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            sum += i;
        }

        System.out.println("1 부터 100 까지의 합: " + sum);

        /*
        주의: for 의 초기화식에는 부동 소수점을 쓰는 float 타입을 사용하면 안됨
        왜냐하면 부동 소수점 방식은 연산 과정에서 정확히 0.1 을 표현하지 못하기 때문에 증감식에서 더해지는 실제 값은 0.1 보다 약간 더 클 수 있음
         */

        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
            }
        }
    }
}
