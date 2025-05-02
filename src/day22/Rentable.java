package src.day22;

// 제네릭 타입 인터페이스
public interface Rentable<P> {
    P rent(); // rent() 메소드의 반환형을 타입 파라미터로 선언
}
