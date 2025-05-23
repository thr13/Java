package src.basic.day26;

public class Button {
    // 정적 멤버 인터페이스
    @FunctionalInterface
    public static interface ClickListener {
        void onClick(); // 추상메소드 1개 - 함수형 인터페이스
    }

    private ClickListener clickListener; // 인터페이스 객체를 필드로 사용

    public void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }

    public void click() {
        this.clickListener.onClick();
    }
}
