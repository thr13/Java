package src.day30;

import java.io.*;

public class CharacterConvertStreamExample {
    public static void main(String[] args) {
        try {
            write("문자 변환 스트림을 사용합니다");
            String data = read();
            System.out.println(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void write(String str) throws IOException {
        // FileOutputStream 에 OutputStreamWriter 보조 스트림을 연결
        OutputStream os = new FileOutputStream("src/day30/temp/test.txt");
        Writer writer = new OutputStreamWriter(os, "UTF-8");

        writer.write(str); // OutputStreamWriter 보조 스트림을 이용해서 문자 출력
        writer.flush(); // 내부에 잔류한 버퍼를 모두 비움
        writer.close(); // 사용한 문자스트림 메모리 해제
    }

    public static String read() throws IOException {
        // FileInputStream 에 InputStreamReader 보조 스트림을 연결
        InputStream is = new FileInputStream("src/day30/temp/test.txt");
        Reader reader = new InputStreamReader(is, "UTF-8");

        // InputStreamReader 보조 스트림을 이용하여 문자 입력
        char[] data = new char[100];
        int num = reader.read(data);
        reader.close(); // 사용한 문자스트림 메모리 해제

        String str = new String(data, 0, num); // char 배열에서 읽은 문자수만큼 새 문자열 생성
        return str;
    }

}
