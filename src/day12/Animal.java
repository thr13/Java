package src.day12;

/*
자식 클래스들이 가지고 있는 공통 메소드를 뽑아서 추상 클래스로 작성할 때, 실행 내용은 자식 클래스마다 달라져야 하는 경우가 많다
실행 내용을 여러개로 구현될 수 있으므로 메소드단에서 abstract 키워드를 붙여서 추상 메소드로 선언할 수 있다
그리고 자식 클래스에서 추상 메소드를 반드시 메소드 오버라이딩(함수 재정의) 해서 실행 내용을 채워야한다
 */
public abstract class Animal {
    public void breathe() {
        System.out.println("숨을 쉽니다");
    }

    // 추상 메소드 선언
    public abstract void sound();
}
