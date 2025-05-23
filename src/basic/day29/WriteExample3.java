package src.basic.day29;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample3 {
    public static void main(String[] args) throws IOException {
        try {
            OutputStream outputStream = new FileOutputStream("src/day29/temp/test3.db");
            byte[] array = {10, 20, 30, 40, 50};

            outputStream.write(array, 1, 3); // index 1번부터 3번까지만 출력

            outputStream.flush(); // 내부 버퍼에 잔류하는 바이트를 출력하고 버퍼를 비움
            outputStream.close(); // 출력 스트림을 닫아서 사용한 메모리 해제
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
