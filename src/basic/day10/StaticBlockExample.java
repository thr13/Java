package src.basic.day10;

public class StaticBlockExample {
    public static void main(String[] args) {
        System.out.println(Television.info);
    }
}

/*
정적 블록은 복잡한 초기화 작업이 필요할때 사용된다 형식은 아래와 같다
static {

}
 */

class Television {
    static String company = "MyCompany";
    static String model = "LCD";
    static String info;

    static {
        info = company + "-" + model; // static 필드인 info 는 정적 블록에서 다른 정적필드들을 연결해서 초기값을 설정함
    }
}

class ClassName {
    int field1;
    void method1() {}

    static int field2;
    static void method2() {}

    static {
        field2 = 10;
        method2();
        /*
        아래는 컴파일 에러 가 발생한다 왜냐하면 정적메소드와 정적블록은 클래스 내부에 인스턴스 필드, 인스턴스 메소드를 사용할 수 없기 떄문이다(객체가 생성되기 전에 존재하기 떄문)
        field1 = 10;
        method1();
         */
    }

    static void method3() {
        /*
        this 키워드도 정적 메소드 내부에서 사용할 수 없다(객체가 생성되기전에 객체 스스로 자기자신을 참조하기 떄문)
        this.field1 = 10;
        this.method1();
         */
        field2 = 10;
        method2();
    }

    static void method4() {
        /*
        만약 정적메소드, 정적블록에서 인스턴스 멤버를 사용할려면, 아래와 같이 객체를 먼저 생성하고 참조 변수로 객체를 접근하면 사용할 수 있다
         */
        ClassName obj = new ClassName();
        obj.field1 = 10; // 객체의 인스턴스 멤버 사용
        obj.method1();
    }
}