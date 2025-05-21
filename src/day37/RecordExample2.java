package src.day37;

// 자바 21 버전 레코드 패턴 - instanceof 뒤에 바로 레코드 호출 가능
public class RecordExample2 {

    private static void area(Object obj) {
        if (obj == null) {
            System.out.println("null");
        } else if (obj instanceof Rectangle(int width, int height)) {
            System.out.println("area: " + (width * height));
        } else {
            System.out.println("unknown");
        }
    }

    // 위의 코드를 switch 문으로 변경 - 레이블 자리에 레코드 패턴 사용
    private static void area2(Object obj) {
        switch (obj) {
            case Rectangle(int width, int height) -> System.out.println("area: " + (width * height));
            case null, default -> System.out.println("unknown");
        }
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 5);
        area(rect);
        area2(rect);
    }
}
