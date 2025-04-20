package src.day15;

/*
익명 자식 객체는 부모 클래스를 상속 받아 아래와 같이 생성된다
new 부모생성자(매개값, ...) {
    필드
    메소드
}
 */
public class Car {
    // 필드에 Tire 객체 대입
    private Tire tire1 = new Tire();

    // 필드에 익명 자식 객체 대입
    private Tire tire2 = new Tire() {
        @Override
        public void roll() {
            System.out.println("필드에 대입된 익명 자식 Tire 객체 1이 굴러갑니다");
        }
    };

    // 클래스의 필드를 이용한 메소드
    public void run1() {
        tire1.roll();
        tire2.roll();
    }

    // 로컬 변수를 이용한 메소드
    public void run2() {
        // 로컬 변수에 익명 자식 객체 대입
        Tire tire = new Tire() {
            @Override
            public void roll() {
                System.out.println("로컬변수에 대입된 익명 자식 Tire 객체 2가 굴러갑니다");
            }
        };
        tire.roll();
    }

    public void run3(Tire tire) {
        tire.roll();
    }
}
