package src.day2;

public class TypeCasting {
    public static void main(String[] args) {
        /*
        기본타입을 허용범위 순으로 나열하면 byte < short, char < int < long < float < double 이렇게 된다
        값의 허용 범위가 작은 타입이 허용 범위가 큰 타입으로 대입될 때 자동 타입 변환이 일어난다
        */
        byte byteValue = 10;
        int intValue = byteValue;
        System.out.println(intValue); // byte 에서 int 로 자동타입변환

        long longValue = 500000L;
        float floatValue = longValue;
        double doubleValue = longValue;
        System.out.println(floatValue);
        System.out.println(doubleValue);

        // char 타입은 int 타입으로 변환될때 유니코드 값이 int 타입에 대입된다
        char charValue= 'A';
        int intValue2 = charValue;
        System.out.println(intValue2);

        // 예외: byte 타입은 char 타입으로 형변환 될 수 없다 왜냐하면 char 타입은 음수를 포함하지 않기 때문

        /*
        반대로 큰 범위 타입을 작은 범위 타입으로 변환하는 것을 강제 타입 변환 이라고 하는데 값의 범위를 벗어나면 데이터 소실이 일어난다
         */
        int intValue3 = 128;
        byte byteValue2 = (byte)intValue3;
        System.out.println(byteValue2);

        int intValue4 = 65;
        char charValue2 = (char)intValue4;
        System.out.println(charValue2);

        double doubleValue2 = 3.14;
        int intValue5 = (int)doubleValue2;
        System.out.println(intValue5); // 실수 -> 정수 로 변환될때 소수부분은 버리고 정수부분만 저장됨

        /*
        정수 타입 리터럴의 연산시 자동으로 범위가 큰 형태로 변환된다
        byte, short 타입 연산은 int
        long 타입 연산은 long
        float 끼리는 float
        float 와 double 연산은 double
        int 와 double 연산은 double
         */
        byte x = 10;
        byte y = 20;
        // byte z = x+y;
        int z = x+y;
        System.out.println(z);

        int intX = 1;
        int intY = 2;
        double doubleResult = intX / intY;
        System.out.println(doubleResult); // 0.0 이 출력된다 왜냐하면 자바에서 정수 연산의 결과는 항상 정수가 되기 때문 즉 0.5 에서 소수부분인 5를 제외하고 0을 실수형으로 표현함

        double doubleResult2 = (double) intX / intY;
        System.out.println(doubleResult2); // 한쪽을 double 형으로 변환하면 계산 결과가 double 형으로 결정도미

        double doubleResult3 = (double) intX / (double) intY;
        System.out.println(doubleResult3); // 마찬가지로 둘다 double 형으로 형변환 하면 결과도 double 형이 된다
    }
}
