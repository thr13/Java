package src.day30;

import java.io.*;
import java.util.Arrays;

public class ObjectInputOutputStreamExample {
    public static void main(String[] args) {
        try {
            // FileOutputStream 에 ObjectOutputStream 보조 스트림 연결
            FileOutputStream fos = new FileOutputStream("src/day30/temp/object.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            Member m1 = new Member("fall", "단풍이");
            Product p1 = new Product("노트북", 1500000);
            int[] arr1 = { 1, 2, 3 };

            // 객체를 직렬화(객체->바이트)해서 파일에 저장
            oos.writeObject(m1);
            oos.writeObject(p1);
            oos.writeObject(arr1);

            oos.flush();
            oos.close();
            fos.close();

            // FileInputStream 에 ObjectInputStream 보조 스트림 연결
            FileInputStream fis = new FileInputStream("src/day30/temp/object.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);

            // 파일을 읽고 역직렬화(바이트->객체)해서 객체로 복원
            Member m2 = (Member) ois.readObject();
            Product p2 = (Product) ois.readObject();
            int[] arr2 = (int[]) ois.readObject();

            ois.close();
            fis.close();

            // 복원된 객체 내용 확인
            System.out.println(m2);
            System.out.println(p2);
            System.out.println(Arrays.toString(arr2));
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
