package src.basic.day18;

import java.util.Properties;
import java.util.Set;

public class GetPropertyExample {
    public static void main(String[] args) {
        // 현재 운영체제와 사용자 정보 출력
        String osName = System.getProperty("os.name");
        String userName = System.getProperty("user.name");
        String userHome = System.getProperty("user.home");

        System.out.println("운영체제 이름: " + osName);
        System.out.println("사용자 이름: " + userName);
        System.out.println("사용자 홈 디렉토리 경로: " + userHome);

        // 전체 키와 값 출력
        System.out.println("--------------------");
        System.out.println(" 키 : 값");
        System.out.println("--------------------");
        Properties props = System.getProperties();
        Set keys = props.keySet();

        for(Object objKey : keys) {
            String key = (String) objKey;
            String value = props.getProperty(key);
            System.out.printf("%-40s: %s\n", key, value);
        }
    }
}
