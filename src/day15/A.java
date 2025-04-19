package src.day15;

/*
중첩 클래스(Nested Class) 는 클래스 내부에 선언한 클래스를 의미함
중첩 클래스는 선언 위치에 따라서 명칭이 달라진다 -> 필드에 위치한 경우 인스턴스 멤버 클래스, 정적 멤버 클래스 라고 하며 메소드 내부에 위치한 경우 로컬 클래스 라고 불린다
 */
public class A {
    // 인스턴스 멤버 클래스
    class B {
        int field1 = 1;

        // 중첩된 클래스 내부에 정적 필드,생성자,메소드는 JAVA 17 부터 선언이 가능함
        static int field2 = 2;

        B() {
            System.out.println("중첩된 클래스 - B 생성자 실행");
        }

        void method1() {
            System.out.println("B 클래스의 method1 실행");
        }

        // 중첩된 클래스 내부에 정적 필드,생성자,메소드는 JAVA 17 부터 선언이 가능함
        static void method2() {
            System.out.println("B 클래스의 method2 실행");
        }
    }

    void useB() {
        B b = new B();
        System.out.println(b.field1);
        b.method1();

        // 중첩된 클래스 B 의 정적 필드 및 메소드 사용
        System.out.println(b.field2);
        B.method2();
    }

    // 인스턴스 필드 생성후 대입
    B field = new B();

    A() {
        B b = new B();
    }

    // 인스턴스 메소드
    void method() {
        B b = new B();
    }
}
