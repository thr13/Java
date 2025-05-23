package src.basic.day36;

import java.util.Date;

// JAVA 8, 11
public class SwitchPatternExample3 {
    public static void method1(Object obj) {
        if (obj == null) {
            System.out.println("unknown 입니다");
        } else if (obj instanceof Integer) {
            int i = (Integer) obj;
            System.out.println(i);
        } else if (obj instanceof String) {
            String s = (String) obj;
            System.out.println("\"" + s + "\"");
        } else {
            System.out.println("unknown 입니다");
        }
    }

    private static void method2(Object obj) {
        String data;
        if (obj == null) {
            data = "unknown 입니다";
        } else if (obj instanceof Integer) {
            data = String.valueOf((Integer) obj);
        } else if (obj instanceof String) {
            data = "\"" + (String)obj + "\"";
        } else {
            data = "unknown 입니다";
        }
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
