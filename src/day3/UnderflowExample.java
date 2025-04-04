package src.day3;

public class UnderflowExample {
    public static void main(String[] args) {
        // byte 는 -128부터 127까지 표현가능
        byte var2 = -125;

        for(int i=0; i<5; i++) {
            var2--;
            System.out.println("var2 = " + var2); // -128 보다 더 낮은 수가 입력될 경우 언더플로우 발생
        }
    }
}
