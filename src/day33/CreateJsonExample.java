package src.day33;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.Charset;

import org.json.JSONArray;
import org.json.JSONObject;

public class CreateJsonExample {
    public static void main(String[] args) {
        try {
            // JSONObject 객체 생성
            JSONObject root = new JSONObject();

            // put() 메소드를 이용하여 JSON 객체에 속성 값 추가
            root.put("id", "winter");
            root.put("name", "한겨울");
            root.put("age", 25);
            root.put("student", true);

            JSONObject tel = new JSONObject();
            tel.put("home", "02-123-1234");
            tel.put("mobile", "010-123-1234");
            root.put("tel", tel);

            // JSONArray 객체 생성
            JSONArray skill = new JSONArray();
            skill.put("java");
            skill.put("C");
            skill.put("C++");

            // JSONObject 객체에 JSONArray 객체 추가
            root.put("skill", skill);

            // toString() 메소드를 이용하여 JSON 데이터를 문자열로 얻기
            String json = root.toString();
            System.out.println(json);

            // 문자열로 변환한 JSON 데이터를 파일로 저장
            Writer writer = new FileWriter("src/day33/member.json", Charset.forName("UTF-8"));
            writer.write(json);

            writer.flush(); // 버퍼에 남아있는 데이터 비움
            writer.close(); // 문자 스트림 종료
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

