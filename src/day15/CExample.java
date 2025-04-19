package src.day15;

/*
C 클래스 외부에서 D 객체(중첩된 클래스, 정적 클래스) 를 생성하려면 C 객체 생성 없이 C 클래스로 접근해서 D 객체를 생성할 수 있다(정적 클래스 호출)
 */
public class CExample {
    public static void main(String[] args) {
        // 정적 멤버 클래스 D 객체 생성
        C.D d = new C.D();
        System.out.println(d.filed1);
        d.method1();

        // D 클래스의 정적 필드 및 메소드 사용
        System.out.println(C.D.filed2);
        C.D.method2();
    }
}
