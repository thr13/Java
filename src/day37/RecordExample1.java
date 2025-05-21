package src.day37;

// 자바 17 버전 레코드 사용 - instanceof 로 매개값 확인 후 타입변환(캐스팅) 그리고 Getter 를 통해 레코드의 필드값을 얻을 수 있따
public class RecordExample1 {
    private static void area(Object obj) {
        if (obj == null) {
            System.out.println("null");
        } else if (obj instanceof Rectangle rect) {
            int width = rect.width();
            int height = rect.height();
            System.out.println("area: " + (width * height));
        } else {
            System.out.println("unknown");
        }
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 5);
        area(rect);
    }
}
