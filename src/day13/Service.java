package src.day13;

/*
인터페이스에서 private 메소드는 구현 객체가 필요한 메소드 이고
private static 메소드는 구현 객체가 필요 없는 메소드 이다
 */
public interface Service {
    // 디폴트메소드는 컴파일 과정에서 자동으로 public 이 붙기 떄문에 외부에서 접근이 가능함
    default void defaultMethod1() {
        System.out.println("디폴트메소드1 종속 코드");
        defaultCommon();
    }

    default void defaultMethod2() {
        System.out.println("디폴트메소드2 종속 코드");
        defaultCommon();
    }

    // private 메소드
    private void defaultCommon() {
        System.out.println("디폴트메소드 중복 코드A");
        System.out.println("디폴트메소드 중복 코드B");
    }

    static void staticMethod1() {
        System.out.println("staticMethod1 종속 코드");
        staticCommon();
    }

    static void staticMethod2() {
        System.out.println("staticMethod2 종속 코드");
        staticCommon();
    }

    // static 메소드 ( 디폴트 메소드 뿐만 아니라 private static 메소드 내부에서 호출이 가능함)
    private static void staticCommon() {
        System.out.println("staticMethod 중복 코드C");
        System.out.println("staticMethod 중복 코드D");
    }
}
