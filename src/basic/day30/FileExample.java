package src.basic.day30;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample {
    public static void main(String[] args) {
        try {
            // File 객체 생성
            File dir = new File("src/day30/temp/images");
            File file1 = new File("src/day30/temp/file1.txt");
            File file2 = new File("src/day30/temp/file2.txt");
            File file3 = new File("src/day30/temp/file3.txt");

            // 디렉토리 또는 파일이 존재하지 않는 경우 생성
            if (!dir.exists()) {
                dir.mkdir(); // 디렉토리 생성
            }
            if (!file1.exists()) {
                file1.createNewFile(); // 파일 생성
            }
            if (!file2.exists()) {
                file2.createNewFile(); // 파일 생성
            }
            if (!file3.exists()) {
                file3.createNewFile(); // 파일 생성
            }

            // temp 폴더의 내용을 출력
            File temp = new File("src/day30/temp");
            File[] contents = temp.listFiles(); // temp 디렉토리와 그 하위 디렉토리에 존재하는 목록을 전부 File 배열로 리턴

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm:ss"); // 날짜 포맷 설정
            for(File file : contents) {
                System.out.printf("%-25s", sdf.format(new Date(file.lastModified()))); // 파일의 마지막 수정날짜를 Date 객체로 생성한 다음 날짜 포맷 적용

                if(file.isDirectory()) {
                    System.out.printf("%-10s%-20s", "<DIR>", file.getName());
                } else {
                    System.out.printf("%-10s%-20s", file.length(), file.getName());
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
