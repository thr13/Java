package src.day15;

// 익명구현객체를 필드, 메서드 로 가지는 클래스 Home
public class Home {
    // 필드에 익명구현객체 대입
    private RemoteControl rc = new RemoteControl() {
        @Override
        public void turnOn() {
            System.out.println("TV 를 켭니다");
        }

        @Override
        public void turnOff() {
            System.out.println("TV를 끕니다");
        }
    };

    // 필드(여기서는 RemoteControl 타입 변수인 rc)를 이용한 메소드
    public void use1() {
        rc.turnOn();
        rc.turnOff();
    }

    // 로컬 변수를 이용한 메소드
    public void use2() {
        // 로컬 변수에 익명구현객체 대입
        RemoteControl rc = new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("에어컨을 킵니다");
            }

            @Override
            public void turnOff() {
                System.out.println("에어컨을 끕니다");
            }
        };
        rc.turnOn();
        rc.turnOff();
    }

    // 매개변수를 이용한 메소드(매개변수 타입이 익명구현객체)
    public void use3(RemoteControl rc) {
        rc.turnOn();
        rc.turnOff();
    }
}
