package src.basic.day3;

public class OverflowExample {
    public static void main(String[] args) {
        // byte 는 -128 부터 127까지 표현이 가능함
        byte var1 = 125;

        for(int i=0; i<5; i++){
            var1++;
            System.out.println("var1 = " + var1); // 127을 초과하는 순간 오버플로우 발생
        }
    }
}
