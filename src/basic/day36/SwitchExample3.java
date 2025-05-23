package src.basic.day36;

// JAVA 8, 11 버전에서 사용하는 Switch 문
public class SwitchExample3 {
    public static void method(String s) {
        if (s == null) {
            System.out.println("null 입니다");
            return;
        }

        switch (s) {
            case "a":
            case "b":
                System.out.println("a or b");
                break;
            case "c":
                System.out.println("c");
                break;
            default:
                System.out.println("d");
        }
    }

    public static void main(String[] args) {
        method(null); // null 입니다 출력
    }
}
