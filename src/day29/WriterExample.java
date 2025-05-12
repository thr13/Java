package src.day29;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterExample {
    public static void main(String[] args) {
        try {
            Writer writer = new FileWriter("src/day29/temp/test.txt");

            char a = 'A';
            char b = 'B';
            writer.write(a); // 문자 A 를 파일에 출력
            writer.write(b); // 문자 B 를 파일에 출력

            char[] arr = { 'C', 'D', 'E'};
            writer.write(arr); // 배열을 파일에 출력

            writer.write("FGH"); // 문자열을 파일에 출력

            writer.flush(); // 버퍼에 잔류하고 있는 문자들을 출력하고 버퍼를 비움
            writer.close(); // 출력 스트리믈 닫고 메모리 해제
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
