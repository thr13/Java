package src.day4;

public class LogicalOperatorExample {
    public static void main(String[] args) {
        /* && 와 & 는 산출결과는 같지만 연산 과정이 조금 다름
        &&은 앞의 피연산자가 false 라면 뒤의 피연산자를 평가하지 않고 바로 false 를 출력
        || 은 앞의 피연산자가 true 라면 뒤의 피연산자를 평가하지 않고 바로 true 를 산출, |은 두 피연산자 모두 퍙기헤사 신츨 결과를 냄
         */
        int charCode1 = 'A';
        int charCode2 = 'a';
        int charCode3 = '0';

        if (65 <= charCode1 & charCode1 <= 90) {
            System.out.println("대문자");
        }

        if (97 <= charCode2 && charCode2 <= 122) {
            System.out.println("소문자");
        }

        if (48 <= charCode3 && charCode3 <= 57) {
            System.out.println("0-9 숫자");
        }

        int intValue = 6;

        if (intValue % 2 == 0 | intValue % 3 == 1) {
            System.out.println("2 또는 3의 배수");
        }

        boolean result = (intValue % 2 == 0 || intValue % 3 == 1);
        if (!result){
            System.out.println("2 또는 3의 배수 아님");
        }
    }
}
