package src.day19;

import java.util.Arrays;

public class BytesToStringExample {
    public static void main(String[] args) throws Exception {
        String data = "자바";

        // String 객체를 byte 배열로 변환 (기본값 UTF-8 인코딩)
        byte[] arr1 = data.getBytes(); //byte[] arr1 = data.getBytes("UTF-8");
        System.out.println("arr1: " + Arrays.toString(arr1));

        // byte 배열 객체를 String 객체로 변환 (기본값 UTF-8 디코딩)
        String str1 = new String(arr1); //byte[] arr1 = data.getBytes("UTF-8");
        System.out.println("str1: " + str1);

        // String 객체를 byte 배열 객체로 변환 (EUC-KR 인코딩)
        byte[] arr2 = str1.getBytes("EUC-KR");
        System.out.println("arr2: " + Arrays.toString(arr2));

        // byte 배열 객체를 String 객체로 변환 (EUC-KR 디코딩)
        String str2 = new String(arr2, "EUC-KR");
        System.out.println("str2: " + str2);
    }
}
