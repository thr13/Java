package src.day11.package1;

/*
접근제어자 protected 는 같은 패키지내에서 접근 가능,
다른 패키지에서 부모클래스 접근불가, 자식클래스 접근 가능 특징을 가진다
 */
public class ProtectedA {
    // protected 로 제한된 필드
    protected String field;

    // protected 로 제한된 생성자
    protected ProtectedA() {}

    // protected 로 제한된 메소드
    protected void method() {
    }
}
