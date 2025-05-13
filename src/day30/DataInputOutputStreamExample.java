package src.day30;

import java.io.*;

public class DataInputOutputStreamExample {
    public static void main(String[] args) {
        try {
            // DataOutputStream 생성
            FileOutputStream fos = new FileOutputStream("src/day30/temp/primitive.db");
            DataOutputStream dos = new DataOutputStream(fos);

            // 기본 타입 출력: String -> double -> int 순
            dos.writeUTF("이시플");
            dos.writeDouble(95.5);
            dos.writeInt(1);

            dos.writeUTF("김자바");
            dos.writeDouble(93.3);
            dos.writeInt(2);

            dos.flush(); // 바이트 스트림에 남아있는 버퍼들을 모두 출력
            dos.close();
            fos.close();

            // DataInputStream 생성
            FileInputStream fis = new FileInputStream("src/day30/temp/primitive.db");
            DataInputStream dis = new DataInputStream(fis);

            // 기본 타입 입력: String -> double -> int 순
            for(int i=0; i<2; i++) {
                String name = dis.readUTF();
                double score = dis.readDouble();
                int order = dis.readInt();
                System.out.println(name + " : " + score + " : " + order);
            }

            dis.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
