package src.basic.day15;

/*
중첩 클래스 내부에서 this 를 사용할 경우 해당 중첩 클래스의 객체(바깥클래스) 를 의미한다
그러므로 바깥클래스이름.this.~ 를 사용하면 내부 클래스에서 바깥 클래스의 객체를 사용할 수 있다 (내부클래스가 정적클래스가 아닌 경우에만)
 */
public class H {
    // 바깥클래스 H 의 인스턴스 필드
    String field = "H-field";

    // 바깥클래스 H 의 인스턴스 메소드
    void method() {
        System.out.println("H-method");
    }

    // 인스턴스 멤버 클래스(내부 클래스)
    class I {
        // 내부클래스 I 의 인스턴스 필드
        String field = "I-field";

        // 내부클래스 I 의 인스턴스 메소드
        void method() {
            System.out.println("I-method");
        }

        // 내부클래스 I 의 인스턴스 메소드
        void print() {
            // 내부클래스 I 의 필드, 메소드 사용
            System.out.println(this.field);
            this.method();

            // 바깥클래스 H 의 필드, 메소드 사용
            System.out.println("A.this.field");
            H.this.method();
        }
    }

    // 바깥클래스 H 의 인스턴스 메소드 - 내부클래스 I 사용방법
    void usdI() {
        I i = new I();
        i.print();
    }

}
