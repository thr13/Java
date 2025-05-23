package src.basic.day37;

public class SwitchLabelExample {
    private static void method1(Object obj) {
        switch (obj) {
            case String s:
                System.out.println("String: " + s);
                break; // 키워드 break 를 생략하면 컴파일 에러 발생 (패턴끼리는 레이블 통과 금지)
            case Integer i:
                System.out.println("Integer: " + i); // default 는 레이블 통과 가능
            case null, default:
                System.out.println("null 또는 unknown 입니다");
        }
    }

    private static void method2(Object obj) {
        switch (obj) {
            case String s -> System.out.println("String: " + s); // 화살표 가 있다면 레이블 통과 금지
            case Integer i -> System.out.println("Integer: " + i); // 다음 레이블이 default 여도 마찬가지로 레이블 통과 금지됨
            case null, default -> System.out.println("null 또는 unknown 입니다");
        }
    }

    public static void main(String[] args) {
        method1("a");
        System.out.println();

        method1(1);
        System.out.println();

        method2(1);
    }
}
