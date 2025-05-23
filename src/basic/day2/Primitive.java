package src.basic.day2;

public class Primitive {
    public static void main(String[] args) {
        // Primitive Type (원시타입) : 실제 값을 메모리에 직접 저장, 크기 고정
        boolean varBoolean = true;
        byte varByte = 127;
        char varChar = 'A'; // unsigned 16bit 유니코드 문자
        short varShort = 1;
        int varInt = 10;
        long varLong = 100L;
        float varFloat = 3.14F; // 부동소수점 값 저장
        double varDouble = 2.7D; // 부동소수점 값 저장

        System.out.println("boolean: " + varBoolean);
        System.out.println("byte: " + varByte);
        System.out.println("char: " + varChar);
        System.out.println("short: " + varShort);
        System.out.println("int: " + varInt);
        System.out.println("long: " + varLong);
        System.out.println("float: " + varFloat);
        System.out.println("double: " + varDouble);
    }
}
