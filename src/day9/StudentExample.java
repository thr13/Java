package src.day9;

public class StudentExample {
    public static void main(String[] args) {
        /*
        객체의 주소는 힙에 저장된다
        변수는 스택에 저장되고 객체의 주소를 참조한다(객체의 주소 번지를 가르킨다)
         */
        Student stu1 = new Student();
        System.out.println("stu1 변수가 Student 객체를 참조합니다");

        Student stu2 = new Student();
        System.out.println("stu2 변수가 또다른 Student 객체를 참조합니다");

        /*
        클래스는 라이브러리 클래스와 실행 클래스로 나뉜다
        라이브러리 클래스는 실행하지 않고 다른 클래스에서 이용하는 클래스이다
        실행 클래스는 main() 메소드를 가지고 있는 실행 가능한 클래스를 의미한다
         */
    }
}
