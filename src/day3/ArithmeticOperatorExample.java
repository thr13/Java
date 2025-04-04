package src.day3;

public class ArithmeticOperatorExample {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static int div(int a, int b) {
        return a / b;
    }

    public static int mod(int a, int b) {
        return a % b;
    }

    public static void main(String[] args) {
        int value1 = 6;
        int value2 = 2;

        System.out.println("ADD: " + add(value1, value2));
        System.out.println("SUB: " + sub(value1, value2));
        System.out.println("MUL: " + mul(value1, value2));
        System.out.println("DIV: " + div(value1, value2));
        System.out.println("MOD: " + mod(value1, value2));
    }


}


