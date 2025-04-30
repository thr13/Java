package src.day21;

public class Service {
    @PrintAnnotation
    public void method1() { // 어노테이션 속성들은 기본값을 가짐
        System.out.println("실행 내용1");
    }

    @PrintAnnotation("*") // 어노테이션 속성 value 의 이름은 생략하고 값만 줄 수 있음
    public void method2() {
        System.out.println("실행 내용2");
    }

    @PrintAnnotation(value="#", number=20) // value 이외에 다른 속성에 값 할당시 모두 명시해야함
    public void method3() {
        System.out.println("실행 내용3");
    }
}
