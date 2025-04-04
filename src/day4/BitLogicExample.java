package src.day4;

public class BitLogicExample {
    public static void main(String[] args) {
        System.out.println("45 & 25 = " + (45 & 25));
        System.out.println("45 | 25 = " + (45 | 25));
        System.out.println("45 ^ 25 = " + (45 ^ 25));

        byte receiveData = -120;

        int unsignedInt1 = receiveData & 255;
        System.out.println("unsignedInt1 = " + unsignedInt1);

        int unsignedInt2 = Byte.toUnsignedInt(receiveData);
        System.out.println("unsignedInt2 = " + unsignedInt2);

        int test = 136;
        byte btest = (byte) test;
        System.out.println("btest = " + btest);
    }
}
