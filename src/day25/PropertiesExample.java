package src.day25;

import java.util.Properties;

public class PropertiesExample {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();

        // 상대경로: PropertiesExample.class 와 동일한 ClassPath 에 존재하는 database.properties 파일 로드
        properties.load(PropertiesExample.class.getResourceAsStream("database.properties"));

        // properties 에 존재하는 키를 기준으로 값 읽기
        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");
        String admin = properties.getProperty("admin");

        // properties 값 출력
        System.out.println("driver: " + driver);
        System.out.println("url: " + url);
        System.out.println("username: " + username);
        System.out.println("password: " + password);
        System.out.println("admin: " + admin);
    }
}
