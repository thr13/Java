package src.basic.day12;

public class ChildExample {
    public static void main(String[] args) {
        // 부모클래스 타입으로 자동타입변환
        Parent parent = new Child();

        // 부모클래스 타입으로 필드, 메소드 사용
        parent.field1 = "데이터1";
        parent.method1();
        parent.method2();

        /*
        자동타입변환할 경우 자식 클래스의 필드와 메소드 사용불가
        parent.field2 = "data2";
        parent.method3();
         */

        // 자식클래스 타입으로 강제타입변환 -> 자식 클래스의 필드와 메소드 사용가능
        Child child = (Child) parent; // 타입캐스팅은 (자식클래스) 부모클래스타입변수 형식으로 사용한다
        child.field2 = "데이터2";
        child.method3();

        // 강제타입변환 이후에도 부모클래스의 필드와 메소드 사용가능함
        child.field1 = "수정된데이터1";
        child.method2();
    }
}
