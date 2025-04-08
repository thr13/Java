package src.day6;

public class StringEqualsExample {
    public static void main(String[] args) {
        /*
        자바는 문자열 리터럴이 동일하면 String 객체를 공유함
         */
        String name1 = "홍길동";
        String name2 = "홍길동"; // name1 과 동일한 String 객체 번지를 저장함
        System.out.println(name1 == name2); // true

        /*
        new 연산자로 직접 객체를 생성하고 대입할 수 있다 그러나 문자열 리터럴로 생성하는 것과 new 연산자로 생성하는 것은 객체 번지가 다를 수 있다
         */
        String name3 = "김철수";
        String name4 = new String("김철수");
        System.out.println(name3 == name4); // false

        /*
        String 객체를 내부 문자열만 비교할 경우에는 equals() 메소드를 사용함
         */
        System.out.println(name3.equals(name4)); // true

        /*
        String 변수에 빈 문자열을 "" 대입할 경우도 String 객체로 생성됨
         */
        String strVal = "";
        if(strVal.equals("")) {
            System.out.println("strVal 변수가 참조하는 String 객체는 빈 문자열");
        }
    }
}
