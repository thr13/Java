package src.basic.day4;

public class CompareOperatorExample {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        boolean result1 = (num1 == num2);
        boolean result2 = (num1 != num2);
        boolean result3 = (num1 <= num2);

        System.out.println("result1: " + result1); // false
        System.out.println("result2: " + result2); // true
        System.out.println("result3: " + result3); // true

        String str1 = "자바";
        String str2 = "JAVA";
        boolean result4 = str1.equals(str2);
        boolean result5 = (!str1.equals(str2));

        System.out.println("result4: " + result4); // false
        System.out.println("result5: " + result5); // true

     }
}
