package src.basic.day30;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesExample {
    public static void main(String[] args) {
        try {
            String data = "" +
                    "id: winter\n" +
                    "email: winter@mycompany.com\n" +
                    "tel: 010-123-1234";

            // Path 객체 생성 (절대경로)
            Path path = Paths.get("src/day30/temp/user.txt");

            // 파일 생성 및 데이터 저장
            Files.writeString(Paths.get("src/day30/temp/user.txt"), data, Charset.forName("UTF-8"));

            // 파일 정보 얻기
            System.out.println("파일 유형: " + Files.probeContentType(path)); // probeContentType() 메소드는 파일 확장명에 따른 파일 유형을 반환함 (.txt 파일은 text/plain 리턴)
            System.out.println("파일 크기: " + Files.size(path) + " bytes");

            // 파일 읽기
            String content = Files.readString(path, Charset.forName("UTF-8")); // readString() 메소드는 텍스트 파일의 내용을 전부 읽고 문자열로 리턴
            System.out.println(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
