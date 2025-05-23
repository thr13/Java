package src.basic.day11;

public class ChildExample {
    public static void main(String[] args) {
        /*
        부모클래스 타입으로 자동타입변환 된 이후에는 부모클래스에 선언된 필드와 메소드만 접근이 가능하다
        비록 변수는 자식 클래스 객체를 참조하지만 변수로 접근 가능한 객체는 부모클래스 멤버로 한정된다
        그러나 자식클래스에서 메소드 오버라이딩이 되었으면 해당 메소드는 자식클래스의 메소드로 호출된다
         */
        Child child = new Child();

        // 자동타입변환(Promotion)
        Parent parent = child;

        parent.method1();
        parent.method2(); // 메소드 오버라이딩 - 자식클래스의 메소드 호출
        // parent.method3(); // 일반적으로 자동타입변환시 자식클래스의 메소드는 호출불가능
    }
}
