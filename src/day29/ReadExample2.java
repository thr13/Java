package src.day29;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample2 {
    public static void main(String[] args) {
        try {
            InputStream inputStream = new FileInputStream("src/day29/temp/test2.db");

            byte[] data = new byte[100];

            while(true) {
                int num = inputStream.read(data); // 최대 100 byte 를 읽고 바이트는 data 에 저장하고 읽은 바이트 수를 리턴

                // 파일 끝에 도달헀을 경우
                if(num == -1) {
                    break;
                }

                for(int i = 0; i < num; i++) {
                    System.out.println(data[i]);
                }
            }
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
