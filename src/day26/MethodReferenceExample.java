package src.day26;

public class MethodReferenceExample {
    public static void main(String[] args) {
        Person3 person3 = new Person3();

        /*
        메소드 참조가 정적 메소드일 경우 표현방법
        클래스이름 :: 정적메소드
        ((매개변수) -> 클래스이름.정적메소드(매개값));
         */
        person3.action(Computer :: staticMethod);
        person3.action((x, y) -> Computer.staticMethod(x, y));

        /*
        메소드 참조가 인스턴스 메소드일 경우 표현방법
        인스턴스객체변수 :: 인스턴스메소드
        ((매개변수) -> 인스턴스객체변수.인스턴스메소드(x, y));
         */
        Computer computer = new Computer();
        person3.action(computer :: instanceMethod);
        person3.action((x, y) -> computer.instanceMethod(x, y));
    }
}
