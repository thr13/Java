package src.day11;

/*
메소드 오버라이딩 - 상속된 부모 클래스의 메소드를 자식 클래스에서 재정의 하는 것을 의미함
메소드가 오버라이드가 되면 부모 클래스의 메소드는 숨겨지고 자식 클래스 메소드가 우선적으로 사용된다

메소드 오버라이드는 부모클래스의 메소드 선언부(리턴타입, 메소드이름, 매개변수) 와 동일해야함
접근제한을 부코클래스의 메소드 보다 더 강하게 오버라이드 할 수 없다 (예) public 을 private 로 변경 불가)
새로운 예외를 throws 할 수 없다
 */
public class Computer extends PICalculator{
    /*
    JAVA 에서는 개발자의 실수를 줄여주기 위해 오버라이드를 확인해주는 @Override 어노테이션이 지원된다
    @Override 는 컴파일 단계에서 정확히 오버라이딩이 되었는지 체크하고 문제가 발생시 컴파일 에러를 출력한다
     */
    @Override
    public double areaCircle(double radius) {
        // super.areaCircle(radius); // super 키워드를 이용하여 자식클래스의 메소드 내부에서 부모클래스의 메소드를 호출가능
        System.out.println("객체 Computer 의 메소드 areaCircle() 실행 ");
        return Math.PI * radius * radius;
    }
}
