package src.day37;

// 자바 8, 11 버전 enum 타입 레이블 사용방법
public class SwitchEnumExample1 {
    private static void method(Shape shape) {
        String result;
        switch (shape) {
            case LINE:
                result = "선을 그립니다";
                break;
            case TRIANGLE:
                result = "삼각형을 그립니다";
                break;
            case RECTANGLE:
                result = "사각형을 그립니다";
                break;
            default:
                result = "도형을 그리지 않습니다";
                break;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        method(Shape.TRIANGLE);
    }
}