package src.day13;

public class Audio implements RemoteControl{
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("Audio 를 켭니다");
    }

    @Override
    public void turnOff() {
        System.out.println("Audio 를 끕니다");
    }

    @Override
    public void setVolume(int volume) {
        if ( volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if ( volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 Audio 볼륨: " + this.volume);
    }

    // 디폴트 메소드도 오버라이드 가 가능하지만 반드시 public 을 붙여야하고 default 키워드는 생략해야 한다
    private int memoryVolume;

    @Override
    public void setMute(boolean mute) {
        if (mute) {
            this.memoryVolume = this.volume;
            System.out.println("무음 처리합니다");
            setVolume(RemoteControl.MIN_VOLUME);
        } else {
            System.out.println("무음을 해제합니다");
            setVolume(this.memoryVolume);
        }
    }
}
