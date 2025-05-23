package src.basic.day33;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class ParseJsonExample {
    public static void main(String[] args) {
        try {
            // JSON 파일로부터 문자열 읽기
            BufferedReader br = new BufferedReader(new FileReader("src/day33/member.json", Charset.forName("UTF-8")));
            String json = br.readLine();
            br.close();

            // JSON 파싱
            JSONObject root = new JSONObject(json); // JSONObject 객체 생성

            // (KEY 를 기준으로 Value 를 가쟈옴) 속성 읽기
            System.out.println("id: " + root.getString("id"));
            System.out.println("name: " + root.getString("name"));
            System.out.println("age: " + root.getInt("age"));
            System.out.println("student: " + root.getBoolean("student"));

            // JSON 객체 속성 정보 읽기
            JSONObject tel = root.getJSONObject("tel");
            System.out.println("home: " + tel.getString("home"));
            System.out.println("mobile: " + tel.getString("mobile"));

            // JSON 배열 속성 정보 읽기
            JSONArray skill = root.getJSONArray("skill");
            System.out.println("skill: ");

            for(int i=0; i<skill.length(); i++) {
                System.out.println(skill.get(i) + ", ");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
