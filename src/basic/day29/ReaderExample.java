package src.basic.day29;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderExample {
    public static void main(String[] args) {
        try {
            Reader reader = null;

            reader = new FileReader("src/day29/temp/test.txt"); // 텍스트 파일로부터 문자 입력 스트림 생성1

            while(true) {
                int data = reader.read(); // 1 문자씩 읽음

                // 문자를 끝까지 읽은 경우 while 문 종료
                if(data == -1) {
                    break;
                }

                System.out.print((char)data); // 읽은 문자 출력
            }
            reader.close(); // 문자 스트림 종료
            System.out.println();

            reader = new FileReader("src/day29/temp/test.txt"); // 텍스트 파일로부터 문자 입력 스트림 생성2
            char[] data = new char[100]; // 읽은 문자를 저장할 배열

            while(true) {
                int num = reader.read(data); // 읽은 문자는 배열에 저장하고 읽은 문자 수를 리턴

                // 끝까지 읽은 경우 종료
                if(num == -1) {
                    break;
                }

                for(int j = 0; j < num; j++) {
                    System.out.print(data[j]); // 읽은 문자가 저장된 배열 출력
                }
            }
            reader.close(); // 문자 스트림 종료
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
