package src.basic.day29;

import java.io.*;

public class ReadExample3 {
    // 파일 복사
    public static void main(String[] args) {
        try {
            String originalFileName = "src/day29/temp/image.jpeg"; // 원본 파일
            String targetFileName = "src/day29/temp/image2.jpeg"; // 복사 파일

            // 입출력 스트림
            InputStream inputStream = new FileInputStream(originalFileName); // 출발지
            OutputStream outputStream = new FileOutputStream(targetFileName); // 도착지

            byte[] data = new byte[1024];

            while(true) {
                int num = inputStream.read(data); // 최대 1024 바이트를 읽고 배열에 저장, 읽은 바이트는 리턴

                // 파일을 끝까지 다 읽으면 반복문 종료
                if(num == -1) {
                    break;
                }
                outputStream.write(data ,0, num); // 읽은 바이트 수만큼 출력
            }
            outputStream.flush(); // 내부 버퍼 잔류 바이트 출력하고 버퍼를 비움
            outputStream.close();
            inputStream.close();

            System.out.println("파일 복사 완료");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
