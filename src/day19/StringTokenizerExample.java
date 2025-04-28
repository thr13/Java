package src.day19;

import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {
        // 여러 종류의 구분자를 사용할 경우 String 객체의 split() 메소드 사용
        String data1 = "홍길동&이수홍,박연수";
        String[] arr = data1.split("&|,"); // & 또는 , 를 구분자로 사용
        for (String token : arr) {
            System.out.println(token);
        }
        System.out.println();

        // 한 종류의 구분자를 사용할 경우 StringTokenizer 객체 사용
        String data2 = "홍길동/이수홍/박연수";
        StringTokenizer st = new StringTokenizer(data2, "/");
        // 다음 토큰이 없을때까지 반복(= 다음 토큰이 존재하면 반복)
        while(st.hasMoreTokens()) {
            String token = st.nextToken();
            System.out.println(token);
        }

    }
}
