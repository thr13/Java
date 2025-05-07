package src.day26;

public class LambdaExample4 {
    public static void main(String[] args) {
        Returnee returnee = new Returnee();

        // 람다식의 실행문이 2개 이상일 경우
        returnee.action((x, y) -> {
            double result = x + y;
            return result;
        });

        // 리턴문이 하나만 존재할 경우 (연산식)
        returnee.action((x, y) -> (x + y));

        // 리턴문이 하나만 존재할 경우 (메소드호출)
        returnee.action((x, y) -> sum(x, y));
    }

    public static double sum(double x, double y) {
        return (x + y);
    }
}
