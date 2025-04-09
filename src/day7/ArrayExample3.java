package src.day7;

public class ArrayExample3 {
    public static void main(String[] args) {
        /*
        배열을 미리 생성할떄, new 연산자를 사용하면 좋다
        반환타입[] 변수이름 = new 반환타입[배열길이];
        new 연산자는 해당 길이의 배열을 생성하고 배열의 번지를 리턴하기 때문에 배열 변수에 대입할 수 있다. 또한, 이미 배열변수가 선언된 후에도 대입가능하다
        타입[] 변수 = null;
        변수 = new 타입[길이];

        JAVA 에서는 new 연산자로 배열을 처음 생성할 경우 기본값으로 초기화된다
         */
        byte[] byteArray = new byte[1];
        System.out.println("byte 초기값: " + byteArray[0]); // byte 타입 초기값 0

        char[] charArray = new char[1];
        System.out.println("charArray 초기값: " + charArray[0]); // char 타입 초기값 '\u0000'

        short[] shortArray = new short[1];
        System.out.println("shortArray 초기값: " + shortArray[0]); // shortArray 초기값 0

        int[] intArray = new int[1];
        System.out.println("intArray 초기값: " + intArray[0]); // intArray 초기값 0

        long[] longArray = new long[1];
        System.out.println("longArray 초기값: " + longArray[0]); // longArray 초기값 0L

        float[] floatArray = new float[1];
        System.out.println("floatArray 초기값: " + floatArray[0]); // floatArray 초기값 0.0F

        double[] doubleArray = new double[1];
        System.out.println("doubleArray 초기값: " + doubleArray[0]); // double 초기값 0.0

        boolean[] booleanArray = new boolean[1];
        System.out.println("booleanArray 초기값: " + booleanArray[0]); // boolean 초기값 false

        String[] stringArray = new String[1];
        System.out.println("참조타입의 초기값: " + stringArray[0]); // 참조타입 초기값 null
    }
}
