package src.basic.day3;

public class PrintfExample {
    public static void main(String[] args) {
        int value = 100;
        System.out.printf("값: %d\n", value);
        System.out.printf("값: %6d\n", value);
        System.out.printf("값: %-6d\n", value);
        System.out.printf("값: %06d\n", value);

        double area = 3.14 * 10 * 10;
        System.out.printf("반지름이 %d인 원의 넓이: %10.2f\n", 10, area);

        String name = "이름";
        String job = "직업";
        System.out.printf("%6d | %-10s | %10s\n", 1, name, job);

    }
}
