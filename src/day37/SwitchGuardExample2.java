package src.day37;

// 자바 21 버전, 가드사용 O
public class SwitchGuardExample2 {
    private static void method(Object obj) {
        int score = switch(obj) {
            case Integer i when i == 1 -> 90;
            case Integer i when i == 2 -> 80;
            case Integer i -> 70;
            case String s when s.equals("a") -> 50;
            case String s when s.equals("b") -> 40;
            case String s -> 30;
            case null, default -> 0;
        };
        System.out.println("score: " + score);
    }

    public static void main(String[] args) {
        method(1);
        method(2);
        method(3);
        method("a");
        method("b");
        method("c");
        method(null);
    }
}
