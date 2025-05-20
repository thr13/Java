package src.day36;

// JAVA 21 버전부터 가능한 switch 문
public class SwitchExample1 {
    public static void method1(String s) {
        switch (s) {
            case null -> System.out.println("null 입니다");
            case "a", "b" -> System.out.println("a or b");
            case "c" -> System.out.println("c");
            default -> System.out.println("unknown 입니다");
        }
    }

    public static void method2(String s) {
        switch (s) {
            case "a", "b" -> System.out.println("a or b");
            case "c" -> System.out.println("c");
            case null, default -> System.out.println("unknown 입니다");
        }
    }

    public static void main(String[] args) {
        method1(null); // "null 입니다" 출력
        method2(null); // "unknown 입니다" 출력
    }
}
