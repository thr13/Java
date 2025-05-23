package src.basic.day15;

public class HExample {
    public static void main(String[] args) {
        // 바깥 클래스 H 객체 생성
        H h = new H();

        // 바깥 클래스의 인스턴스 메소드로 내부 클래스 사용
        h.usdI();
    }
}
