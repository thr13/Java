package src.day5;

public class SwitchExpression {
    public static void main(String[] args) {
        /*
        JAVA 12 이후부터 switch 문에서 Expressions(표현식) 사용가능
        break 문 과 콜론 대신 -> 와 {} 를 사용
         */
        char grade = 'B';

        switch (grade) {
            case 'A', 'a' -> {
                System.out.println("우수 회원입니다");
            }
            case 'B', 'b' -> {
                System.out.println("일반 회원입니다");
            }
            case 'C', 'c' -> {
                System.out.println("게스트 회원입니다");
            }
        }

        /*
        {} 내부에 실행문이 하나일 경우 중괄호를 생략할 수 있다
         */
        switch (grade) {
            case 'A', 'a' -> System.out.println("우수 회원입니다");
            case 'B', 'b' -> System.out.println("일반 회원입니다");
            case 'C', 'c' -> System.out.println("게스트 회원입니다");
        }
    }
}
