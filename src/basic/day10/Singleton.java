package src.basic.day10;

/*
애플리케이션 전체에서 단 하나의 객체만 생성해서 사용할 경우 싱글톤(Singleton) 패턴을 적용할 수 있다
싱글톤 패턴의 핵심은 생성자를 private 로 선언해서 외부에서 new 연산자로 생성자를 호출할 수 없도록 막는 것 이다
대신에 싱글톤 패턴이 제공하는 정적 메소드를 통해서 간접적으로 객체를 얻을 수 있도록 만든다
즉, private static 클래스타입 변수이름 = new 클래스타입(); 으로 private 접근권한을 가지는 정적필드를 선언과 동시에 초기화 하여
이를 public 정적 메소드를 통해 객체를 얻을 수 있도록하는 것이다
public static 클래스타입 getInstance() {
    return 변수이름;
}
 */
public class Singleton {
    private static Singleton singleton = new Singleton();

    // 생성자를 private 로 접근제한해 외부에서 객체 생성을 막는다
    private Singleton() {}

    public static Singleton getInstance() {
        return singleton;
    }
}
