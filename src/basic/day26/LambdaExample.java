package src.basic.day26;

public class LambdaExample {
    public static void main(String[] args) {
        // 람다식 1 - 메소드의 데이터를 가지고 처리 내용을 변경함
        action((x, y) -> {
            int result = x + y;
            System.out.println("result: " + result);
        });

        // 람다식 2 - 메소드의 데이터를 가지고 처리 내용을 변경함
        action((x, y) -> {
            int result = x - y;
            System.out.println("result: " + result);
        });
    }
    
    // 람다식에 데이터를 제공할 정적 메소드
    public static void action(Calculable calculable) {
        // 람다식에 제공될 데이터
        int x = 10;
        int y = 4;
        calculable.calculate(x, y); // 추상 메소드 호출
    }
}
