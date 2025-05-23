package src.basic.day13;

public class RemoteControlExample {
    public static void main(String[] args) {
        /*
        인터페이스를 통해 구현객체를 사용할려면, 인터페이스 타입의 변수에 구현체 객체를 대입해야한다
        그 이후 인터페이스의 추상메소드를 호출할 수 있다(호출 메소드는 오버라이드 된 구현체 메소드로 출력됨)
         */
        RemoteControl rc;
        rc = new Television(); // 또는 RemoteControl rc = new Television(); 처럼 선언과 구현 객체의 번지 대입을 같은 라인에 해도 된다
        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();

        System.out.println();
        rc.setMute(true); // 디폴트 메소드 호출
        rc.setMute(false);
        //System.out.println("리모콘 최대 볼륨 : " + RemoteControl.MAX_VOLUME);
        //System.out.println("리모콘 최소 볼륨 : " + RemoteControl.MIN_VOLUME);

        System.out.println();
        rc = new Audio(); // 인터페이스 구현체 교체
        rc.turnOn();
        rc.setVolume(5);
        rc.setMute(true);
        rc.setMute(false);

        System.out.println();
        RemoteControl.changeBattery();
    }
}
