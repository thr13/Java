package src.basic.day15;

/*
익명 자식 객체가 부모 타입에 대입되어 부모 메소드를 호출할 경우
오버라이드 된 익명 자식 객체의 메소드가 실행되는 것을 확인할 수 있다
 */
public class CarExample {
    public static void main(String[] args) {
        Car car = new Car();

        // 익명 자식 객체가 대입된 필드 사용
        car.run1();

        // 익명 자식 객체가 대입된 로컬변수 사용
        car.run2();

        // 익명 자식 객체가 대입된 매개변수 사용
        car.run3(new Tire() {
            @Override
            public void roll() {
                System.out.println("매개변수로 사용된 익명 자식 객체 Tire 객체 3이 굴러갑니다");
            }
        });
    }
}
