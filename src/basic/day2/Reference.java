package src.basic.day2;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
public class Reference {
    public static void main(String[] args) {
        // Reference Type (참조타입) : 객체의 메모리 주소를 저장
        Person person1 = new Person("Sugwan", 25); // 참조변수 person1 선언 및 객체 생성
        Person person2 = person1; // person1 이 참조하는 객체를 참조하는 person2 생성
        System.out.println("이름: " + person1.name + ", " + "나이: " + person1.age);
        System.out.println("이름: " + person2.name + ", " + "나이: " + person2.age);

        // person2 를 변경하면 같은 객체를 참조하는 person1 이 영향을 받음
        person2.name = "gwansu";
        person2.age = 27;
        System.out.println("이름: " + person1.name + ", " + "나이: " + person1.age);
    }
}
