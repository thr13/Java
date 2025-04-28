package src.day19;

public class ValueCompareExample {
    public static void main(String[] args) {
        // -128 ~ 127 초과값인 경우: ==, != 연산 불가능
        Integer obj1 = 300;
        Integer obj2 = 300;
        System.out.println("== 연산 " + (obj1 == obj2));
        System.out.println("equals() 연산 " + obj1.equals(obj2));
        System.out.println();

        // -128 ~ 127 범위내일 경우: ==, != 연산 가능
        Integer obj3 = 10;
        Integer obj4 = 10;
        System.out.println("== 연산 " + (obj3 == obj4));
        System.out.println("equals() 연산 " + obj3.equals(obj4));
    }
}
