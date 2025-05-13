package src.day30;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineExample {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("src/day30/ReadLineExample.java"));
            int lineNo = 1;

            while(true) {
                String str = br.readLine(); // 파일의 내용을 1행씩 읽음

                // 더 이상 읽을 내용이 없으면 while 문 종료
                if(str == null) {
                    break;
                }
                System.out.println(lineNo + "\t" + str);
                lineNo++;
            }
            br.close(); // BufferedReader 를 닫으면 연결된 FileReader 도 닫힘
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}