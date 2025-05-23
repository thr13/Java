package src.basic.day6;

public class LengthExample {
    public static void main(String[] args) {
        /*
        문자열의 길이를 알고싶다면 length() 메소드를 사용한다
        length() 메소드의 반환형은 int 형 이다
         */
        String ssn = "9506241230123";
        int length = ssn.length();

        if (length == 13) {
            System.out.println("주민등록번호 자릿수가 맞습니다");
        } else {
            System.out.println("주민등록번호 자릿수가 틀립니다");
        }
    }
}
