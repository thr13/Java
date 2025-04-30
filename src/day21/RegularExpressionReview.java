package src.day21;

public class RegularExpressionReview {
    // 정규표현식 복습
    public static void main(String[] args) {
        String reg1 = "abc";
        System.out.println(reg1.matches("a.c")); // "aac", "abc", "adc" 와 같이 a 로시작하고 c 로끝나는 3문자인지
        System.out.println("b".matches("[abc]")); // [] 대괄호 내부 문자중 1개
        System.out.println("d".matches("[^abc]")); // [] 대골화 내부 문자를 제외한 문자 1개
        System.out.println("d".matches("[a-z]")); // a 부터 z 사이의 영소문자 1개
        System.out.println("D".matches("[A-Z]")); // A 부터 Z 사이의 영대문자 1개
        System.out.println("1".matches("[0-9]")); // 0 부터 9 사이의 숫자 1개
        System.out.println("1".matches("\\d")); // 0 부터 9 사이의 숫자 1개
        System.out.println("ㅁ".matches("\\D")); // 숫자가 아닌 문자 1개
        System.out.println(" ".matches("\\s")); // 공백문자(스페이스, \t, \n) 1개
        System.out.println("_".matches("\\w")); // 영문자. 숫자, 언더바(_) 중 1개
        System.out.println("$".matches("\\W")); // 영문자, 숫자, 언더바(_) 가 아닌 것 중 1개
        System.out.println("ab".matches("a*b")); // * 앞의 표현식이 없거나 1개 이상 반복되는지
        System.out.println("aab".matches("a+b")); // + 앞의 표현식이 1번 이상 반복되는지
        System.out.println("ab".matches("a?b")); // ? 앞의 표현식이 0번 또는 1번 나타나는지
        System.out.println("aaaa".matches("a{4}")); // {} 앞의 표현식이 중괄호 안의 숫자만큼 반복되는지
        System.out.println("aaa".matches("a{2,4}")); // {n,m} 앞의 표현식만 n 이상 m 이하 반복되는지
        System.out.println("start".matches("^start")); // ^ 뒤의 문자열이 시작되는지
        System.out.println("end".matches("end$")); // $ 앞의 문자열로 끝나는지
        System.out.println("start".matches("\\bstart\\b")); // 경계 사이의 단어와 정확히 일치하는지
        System.out.println("@".matches("\\B@\\B")); // 경계 사이의 문자, 숫자, 언더바 가 아닌 것과 정확히 일치하는지
        System.out.println("ab".matches("(ab)")); // () 괄호 안의 문자열로 이뤄진 패턴이 존재하는지
        System.out.println("ababab".matches("(ab)+")); // 캡처그룹 () 괄호 안의 문자열로 이뤄진 패턴이 1번 이상 반복되어 존재하는지
        System.out.println("aba".matches("(.)b\\1")); // \\1 은 캡처 그룹(여기서는 문자 a) 자신의 바로 뒤 문자가 b 그리고 문자 b 뒤에 첫번째 캡처 그룹과 일치하는지
        System.out.println("a".matches("a|b")); // | 앞 뒤 에 존재하는 표현식이 1개라도 존재하는지
    }
}
