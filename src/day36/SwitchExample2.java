package src.day36;

// JAVA 17 이하 switch 문
public class SwitchExample2 {
    public static void method(String s) {
        if (s == null) {
            System.out.println("null 입니다");
            return;
        }

        switch (s) {
            case "a", "b" -> System.out.println("a or b");
            case "c" -> System.out.println("c");
            default -> System.out.println("d");
        }
    }

    public static void main(String[] args) {
        method(null); // null 입니다 출력
    }
}
