package src.basic.day38;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class DefaultCharsetExample {
    public static void main(String[] args) throws IOException {
        // 자바 기본 문자셋 확인 - 자바 21 버전부터 UTF-8 로 통합됨
        Charset javaCharset = Charset.defaultCharset();
        System.out.println("자바의 기본 문자셋: " + javaCharset.toString());

        // 한글을 byte[] 배열로 변환할 때, 한글자당 바이트 수가 얼마인지 확인 (3byte)
        byte[] bytes = "자바".getBytes();
        System.out.println("한 글자당 바이트 수: " + bytes.length + " bytes");

        // 한글 파일 저장시, 한글 한 글자당 바이트 수가 얼마인지 확인
        File file = new File("src/day38/temp/file.txt");
        FileWriter writer = new FileWriter(file);
        writer.write("한글");
        writer.flush();
        writer.close();
        System.out.println("file size: " + file.length() + " bytes");
    }
}
