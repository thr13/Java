package src.day29;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {
    public static void main(String[] args) {
        try {
            OutputStream outputStream = new FileOutputStream("src/day29/temp/test1.db");

            byte a = 10;
            byte b = 20;
            byte c = 30;

            outputStream.write(a); // 1byte 씩 출력
            outputStream.write(b);
            outputStream.write(c);

            outputStream.flush(); // 내부 버퍼에 남아있는 바이트를 출력하고 버퍼를 비움
            outputStream.close(); // 출력 스트림을 닫아서 사용한 메모리 해제

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
