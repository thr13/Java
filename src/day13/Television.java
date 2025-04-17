package src.day13;

public class Television implements RemoteControl {
    private int volume;

    // 인터페이스에 선언된 turnOn() 추상메소드
    @Override
    public void turnOn() {
        System.out.println("TV 를 켭니다");
    }

    @Override
    public void turnOff() {
        System.out.println("TV 를 끕니다");
    }

    @Override
    public void setVolume(int volume) {
        // 인터페이스 상수 필드를 이용해서 필드 값 제한 (매개값 으로 변경될 범위를 제한함)
        if ( volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if ( volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 TV 볼륨: " + this.volume);
    }
}
