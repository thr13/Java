package src.basic.day3;

public class InfinityAndNaNCheckException {
    public static void main(String[] args) {
        int x = 5;
        double y = 0.0;
        double z = x / y; // Infinity 발생
        // double w = x % y; // NaN 발생

        if(Double.isInfinite(z) || Double.isNaN(z)) {
            System.out.println("값을 산출 할 수 없습니다");
        } else {
            System.out.println(z+2);
        }
    }
}
