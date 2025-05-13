package src.day30;

import java.io.*;

public class BufferExample {
    public static void main(String[] args) {
        try {
            // 리플렉션을 활용하여 복사할 파일 위치와 저장위치를 문자열로 저장
            String originalFilePath1 = BufferExample.class.getResource("image1.jpeg").getPath();
            String targetFilePath1 = "src/day30/temp/targetFile1.jpeg";

            // 입출력 스트림 생성
            FileInputStream fis1 = new FileInputStream(originalFilePath1);
            FileOutputStream fos1 = new FileOutputStream(targetFilePath1);

            String originalFilePath2 = BufferExample.class.getResource("image2.jpg").getPath();
            String targetFilePath2 = "src/day30/temp/targetFile2.jpg";

            // 입출력 스트림 + 버퍼 스트림 생성
            FileInputStream fis2 = new FileInputStream(originalFilePath2);
            FileOutputStream fos2 = new FileOutputStream(targetFilePath2);

            BufferedInputStream bis = new BufferedInputStream(fis2);
            BufferedOutputStream bos = new BufferedOutputStream(fos2);

            // 버퍼를 사용하지 않고 복사
            long nonBufferTime = copy(fis1, fos1);
            System.out.println("버퍼 미사용:\t" + nonBufferTime + " ns");

            // 버퍼를 사용하고 복사
            long bufferTime = copy(bis, bos);
            System.out.println("버퍼 사용:\t" + bufferTime + " ns");

            fis1.close();
            fos1.close();
            bis.close();
            bos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static long copy(InputStream is, OutputStream os) throws IOException {
        long start = System.nanoTime(); // 시작 시간

        // 1 바이트를 읽고, 1 바이트를 출력
        while(true) {
            int data = is.read();
            if (data == -1) {
                break;
            }
            os.write(data);
        }
        os.flush();

        long end = System.nanoTime(); // 종료 시간
        return (end - start);
    }
}
