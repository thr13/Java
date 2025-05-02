package src.day22;

// 인터페이스 Rentable 의 타입 파라미터 P 를 Car 클래스로 교체해서 구현함
public class CarAgency implements Rentable<Car> {
    // 선언된 메소드 rent() 의 구현체의 반환형도 교체된 타입 파라미터 Car 이 되야한다
    @Override
    public Car rent() {
        return new Car();
    }
}
