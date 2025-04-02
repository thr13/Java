package src.day2;

public class StringCasting {
    public static void main(String[] args) {
        // 문자열을 원시형으로 형변환
        String str1 = "10";
        byte byteValue = Byte.parseByte(str1);
        System.out.println(byteValue);

        short shortValue = Short.parseShort(str1);
        System.out.println(shortValue);

        int intValue = Integer.parseInt(str1);
        System.out.println(intValue);

        long longValue = Long.parseLong(str1);
        System.out.println(longValue);

        String str2 = "3.14";

        float floatValue = Float.parseFloat(str2);
        System.out.println(floatValue);

        double doubleValue = Double.parseDouble(str2);
        System.out.println(doubleValue);

        String str3 = "true";
        boolean booleanValue = Boolean.parseBoolean(str3);
        System.out.println(booleanValue);

        // 반대로 기본타입의 값을 문자열로 변경시
        int x = 1;
        String str4 = String.valueOf(x);
        System.out.println(str4);
    }
}
