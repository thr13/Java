package src.day15;

/*
중첩된 클래스에서 정적 멤버 클래스 내부 요소들은 바깥 클래스의 인스턴스 필드와 인스턴스 메소드를 사용할 수 없다
왜냐하면 정적 멤버 클래스는 바깥 객체가 없어도 사용가능하기 떄문
 */
public class E {
    // 바깥 클래스 E 의 인스턴스 필드와 메소드
    int field1;
    void method1() {}

    // 바깥 클래스 E 의 정적 필드와 메소드
    static int field2;
    static void method2() {}

    // 인스턴스 멤버 클래스 F
    class F {

        void method() {
            // 바깥 클래스 E 의 인스턴스 필드와 메소드 사용
            field1 = 10;
            method1();

            // 바깥 클래스 E 의 정적 필드와 메소드 사용
            field2 = 10;
            method2();
        }
    }

    // 정적 멤버 클래스 G
    static class G {
        void method() {
            // 바깥 클래스 E 의 인스턴스 필드와 메소드는 사용 불가 (바깥클래스가 정적클래스가 아니므로 사용불가능)
            //field1 = 10;
            //method1();

            // 바깥 클래스 E 의 정ㅈ거 필드와 메소드 사용
            field2 = 10;
            method2();
        }
    }
}
