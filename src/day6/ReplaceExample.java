package src.day6;

public class ReplaceExample {
    public static void main(String[] args) {
        /*
        문자열에서 특정 문자열을 다른 문자열로 대체할 경우 replace() 메소드를 사용함
        String 객체는 불변 이므로 기존 문자열을 그대로 두고 새로운 문자열을 리턴함 (완전히 새로운 문자열)
        사용방법은 .replace(교체대상, 교체단어)
         */
        String oldStr = "자바 프로그래밍";
        String newStr = oldStr.replace("자바", "JAVA");
        System.out.println(newStr);
    }
}
