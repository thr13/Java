package src.day26;

public class LambdaExample3 {
    public static void main(String[] args) {
        Person2 person2 = new Person2();

        // 매개변수가 2개일 경우
        person2.action1((name, job) -> {
            System.out.print(name + "이 ");
            System.out.println(job + "을 합니다");
        });
        person2.action1((name, job) -> System.out.println(name + "이 " + job + "을 하지 않습니다")); // 실행문이 1개일 경우 중괄호 {} 생략 가능

        // 매개변수가 1개일 경우
        person2.action2(word -> {
            System.out.print("\"" + word + "\"");
            System.out.println("라고 말합니다");
        });
        person2.action2(word -> System.out.println("\"" + word + "\"라고 외칩니다")); // 실행문이 1개일 경우 중괄호 {} 생략 가능
    }
}
