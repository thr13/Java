package src.day22;

// 인터페이스 Rentable 의 타입 파라미터 P 를 Home 클래스로 교체해서 구현함
public class HomeAgency implements Rentable<Home> {
    // 선언된 메소드 rent() 의 반환형인 타입 파라미터 P 도 마찬가지로 교체된 Home 이 되야한다
    @Override
    public Home rent() {
        return new Home();
    }
}
