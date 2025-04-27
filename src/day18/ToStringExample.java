package src.day18;

public class ToStringExample {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("삼성전자", "안드로이드");

        String strObj = myPhone.toString();
        System.out.println(strObj);

        System.out.println(myPhone); // System.out.println() 은 매개값이 객체일 경우 toString() 메소드가 호출된다
    }
}
