package src.basic.day4;

public class BitShiftExample {
    public static void main(String[] args) {
        int num1 = 1;
        int result1 = num1 << 3; // 이진법 1000 , 십진법으로 8
        int result2 = num1 + (int) Math.pow(2, 3); // 1 + 2의3승 , Math,pow() 는 반환형이 double 이므로 정수부분을 구하고 싶다면 (int) 로 캐스팅해야됨

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);

        int num2 = -8;
        int result3 = num2 >> 3;
        int result4 = num2 / (int) Math.pow(2, 3);

        System.out.println("result3 = " + result3);
        System.out.println("result4 = " + result4);
    }
}
