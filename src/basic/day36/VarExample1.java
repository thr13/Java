package src.basic.day36;

public class VarExample1 {
    public static void main(String[] args) {
        String name = getData();
        System.out.println(name);

        // 지역변수타입추론
        var userName = getData();
        System.out.println(userName);

        if (name instanceof String && userName instanceof String) {
            System.out.println("두 변수는 문자열 타입입니다");
        }
    }

    public static String getData() {
        return "김자바";
    }
}
