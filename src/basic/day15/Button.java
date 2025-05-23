package src.basic.day15;

/*
중첩 인터페이스는 클래스의 멤버 자리에서 선언된 인터페이스를 의미함
중첩 인터페이스는 암시적으로 static 키워드를 가지고 static 는 생략해도 클래스 객체없이 인터페이스를 바로 사용할 수 있다

이렇게 만들 경우 바깥클래스객체.인터페이스타입 을 구현하는 클래스의 객체를 생성해,
인터페이스 내부의 Setter 를 이용해 new 연산자와 함꼐 구현 객체를 매개값으로 넣어서 주입 할 수 있다

 */
public class Button {
    // 정적 멤버 인터페이스
    public static interface ClickListener {
        // 추상메소드
        void onClick();
    }

    // 중첩 인터페이스 타입으로 private 필드와 Setter 를 선언함
    private ClickListener clickListener;

    public void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }

    // Button 이 클릭되었을때(동작) 실행하는 메소드
    public void click() {
        // 정적 멤버 인터페이스의 추상클래스 호출
        this.clickListener.onClick();
    }
}
