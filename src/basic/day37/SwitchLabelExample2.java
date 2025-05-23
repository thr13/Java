package src.basic.day37;

// 자바 21 버전
public class SwitchLabelExample2 {
    private static void method1(Integer obj) {
        switch (obj) {
            case 0 -> System.out.println("0");
            case Integer i when i > 0 -> System.out.println("positive number");
            case Integer i -> System.out.println("negative number");
        }
    }

    private static class A {

    }

    private static class B extends A {

    }

    private static void method2(Object obj) {
        switch (obj) {
            case B b -> System.out.println("obj 는 B 타입 입니다");
            case A a -> System.out.println("obj 는 A 타입 입니다");
            case null, default -> System.out.println("obj 는 null 또는 unknown 타입 입니다");
        }
    }

    public static void main(String[] args) {
        method1(5);
        method2(new A());
    }
}
