package src.basic.day13;
/*
인터페이스 - 인터페이스를 가져다 쓰는 객체는 인터페이스를 구현하는 클래스가 무엇인지 몰라도 쓸 수 있다는 장점이 있다
인터페이스 구현체는 implements 인터페이스이름 으로 어떤 인터페이스를 구현하고 있는지 명시해야한다

예) 인터페이스 선언
접근제어자 interface 인테페이스이름 {

}

인터페이스에 선언된 필드는 모두 public static final 특성을 가지며 생략하더라도 자동적으로 컴파일 과정에서 붙게 된다
 */
public interface RemoteControl {
    // 상수 필드
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    void turnOn(); // 인터페이스의 메소드는 public abstract 가 컴파일 과정에서 자동적으로 붙게 된다
    void turnOff();
    void setVolume(int volume);

    /*
    인터페이스에서 디폴트메소드는 추상 메소드와 다르게 {} 를 사용해서 호출 코드를 작성할 수 있다
    컴파일 과정에서 public 가 자동으로 붙는다
     */
    default void setMute(boolean mute) {
        if (mute) {
            System.out.println("무음 처리합니다");
            setVolume(MIN_VOLUME);
        } else {
            System.out.println("무음을 해제합니다");
        }
    }

    /*
    정적 메소드도 마찬가지로 컴파일 과정에서 public 이 붙는다 (private 가 아닌경우)
    또한, 실행부에서 정적 타입이 아닌 추상 메소드, 디폴트 메소드, private 메소드 등 을 호출할 수 없다
     */
    static void changeBattery() {
        System.out.println("리모콘 건전지를 교환합니다");
    }
}
