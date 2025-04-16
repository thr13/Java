package src.day12;

/*
객체의 타입을 확인하는 방법 : instanceof 연산자를 사용한다 (반환형은 boolean)
객체 instanceof 타입;
이고 예시로는
public void method(Parent parent) {
    // 매개변수 parent 가 참조하는 객체가 Child 타입인지를 확인
    if(parent instanceof Child) {
        Child child = (Child) parent;
    }
}
Java 12 버전부터 instanceof 연산 결과가 true 일 경우, 강제타입변환 없이 연산식의 우측에 있는 변수를 타입 그대로 사용할 수 있다

 */
public class InstanceOfExample {
    public static void personInfo(Person person) {
        System.out.println("이름: " + person.name);
        person.walk();

        /*
        //person 이 참조하는 객체가 student 타입인지 확인 -> Student 객체일 경우 강제타입변환 -> JAVA 11 버전 까지 사용방법
        if (person instanceof Student) {
            Student student = (Student) person;
            System.out.println("studentNo: " + student.studentNo);
            student.study();
        }
         */

        // 위 주석과 같은 내용 - JAVA 12 버전 부터 사용가능
        if (person instanceof Student student) {
            System.out.println("studentNo: " + student.studentNo);
            student.study();
        }
    }
    public static void main(String[] args) {
        // 매개값으로 Person 객체 제공
        Person p1 = new Person("홍길동");
        personInfo(p1);

        System.out.println();

        // 매개값으로 Student 객체 제공
        Person p2 = new Student("김길동", 10);
        personInfo(p2);
    }
}
