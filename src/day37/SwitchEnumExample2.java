package src.day37;

// 자바 17 버전
public class SwitchEnumExample2 {
    private static void method(Shape shape) {
        String result = switch (shape) {
            case LINE -> "선을 그립니다";
            case TRIANGLE -> "삼각형을 그립니다";
            case RECTANGLE -> "사각형을 그립니다";
        };
        System.out.println(result);
    }

    public static void main(String[] args) {
        method(Shape.TRIANGLE);
    }
}
