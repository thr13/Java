package src.day26;

public class LambdaExample2 {
    public static void main(String[] args) {
        Person person = new Person();

        // 람다식의 실행문이 2개 이상인 경우 중괄호가 필수
        person.action(() -> {
            System.out.println("출근을 합닌다");
            System.out.println("프로그래밍을 합니다");
        });

        // 람다식의 실행문이 1개일 경우 중괄호 생략 가능
        person.action(() -> System.out.println("퇴근합니다"));
    }
}
