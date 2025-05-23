package src.basic.day29;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {
    public static void main(String[] args) {
        try {
            // 데이터의 출발지를 test1.db 로 하는 입력 스트림 생성
            InputStream inputStream = new FileInputStream("src/day29/temp/test1.db");

            while(true) {
                int data = inputStream.read(); // 1byte 씩 읽기

                // 파일 끝에 도달한 경우
                if(data == -1) {
                    break;
                }
                System.out.println(data);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
