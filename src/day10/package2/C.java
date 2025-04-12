package src.day10.package2;

import src.day10.package1.A;

public class C {
    A a1 = new A(true); // public 이므로 같은 패키지내 접근 가능
    // A a2 = new A(1); // default 이므로 다른 패키지내 접근 불가
    // A a3 = new A("문자열"); // private 이므로 접근 불가
}
