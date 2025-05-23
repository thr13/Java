package src.basic.day10.package1;

public class B {
    A a1 = new A(true); // public 이므로 같은 패키지내 접근 가능
    A a2 = new A(1); // default 이므로 같은 패키지내 접근 가능
    // A a3 = new A("문자열"); // private 이므로 접근 불가
}
