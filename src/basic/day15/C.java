package src.basic.day15;

public class C {
    // 정적 멤버 클래스
    static class D {
        int filed1 = 1;

        // 정적 멤버 클래스 내부에서 정적 핋드, 생성자, 메소드를 이용하는 것도 JAVA 17 부터 적용이 가능하다
        static int filed2 = 2;

        D() {
            System.out.println("D 생성자 실행");
        }

        void method1() {
            System.out.println("D method1 실행");
        }

        // 정적 멤버 클래스 내부에서 정적 핋드, 생성자, 메소드를 이용하는 것도 JAVA 17 부터 적용이 가능
        static void method2() {
            System.out.println("D method2 실행");
        }
    }

    // 인스턴스 필드값으로 D (중첩된클래스) 객체 대입
    D filed1 = new D();

    // 정적 필드값으로 대입
    static D filed2 = new D();

    C() {
        D d = new D();
    }

    void method1() {
        D d = new D();
    }

    static void method2() {
        D d  = new D();
    }
}
