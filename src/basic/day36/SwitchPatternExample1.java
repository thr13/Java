package src.basic.day36;

import java.util.Date;

// JAVA 21
public class SwitchPatternExample1 {
    public static void method1(Object obj) {
        switch(obj) {
            case Integer i -> System.out.println(i);
            case String s -> System.out.println("\"" + s + "\"");
            case null, default -> System.out.println("unknown 입니다");
        };
    }

    private static void method2(Object obj) {
        String data = switch(obj) {
            case Integer i -> String.valueOf(i);
            case String s -> "\"" + s + "\"";
            case null, default -> "unknown 입니다";
        };
        System.out.println(data);
    }

    public static void main(String[] args) {
        method1(10);
        method1("10");
        method1(null);
        method1(new Date());
        System.out.println();
        method2(10);
        method2("10");
        method2(null);
        method2(new Date());
    }
}
