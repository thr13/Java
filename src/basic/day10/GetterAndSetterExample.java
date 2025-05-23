package src.basic.day10;

public class GetterAndSetterExample {
    // 필드 선언 - private 접근제한을 설정해서 외부에서 필드를 직접 변경 못하도록 막음
    private int speed;
    private boolean stop;

    // Getter 는 boolean 타입을 제외하고 get~ 으로 이름을 짓는게 관레이다(boolean 타입은 is~)
    public int getSpeed() {
        return speed;
    }
    // Setter 에서 외부에서 제공된 변경값(매개값) 을 검증할 수 있다
    public void setSpeed(int speed) {
        if (speed < 0) {
            this.speed = 0;
            return; // 매개값이 음수일 경우 필드값을 0 으로 설정하고 메소드를 종료시킨다
        }
        this.speed = speed;
    }

    public boolean isStop() {
        return stop;
    }

    public void setStop(boolean stop) {
        this.stop = stop;
        if(stop == true) {
            this.speed = 0;
        }
    }

    public static void main(String[] args) {
        GetterAndSetterExample example = new GetterAndSetterExample();

        // 잘못된 필드값 변경 -> setter 에서 조건문으로 막을 수 있다
        example.setSpeed(-10);
        System.out.println("현재속도: " + example.getSpeed());

        // 올바른 필드값 변경
        example.setSpeed(20);
        System.out.println("현재속도: " + example.getSpeed());

        if(!example.isStop()) {
            example.setStop(true);
        }
        System.out.println("현재속도: " + example.getSpeed());
    }
}
