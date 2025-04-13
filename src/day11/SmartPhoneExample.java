package src.day11;

public class SmartPhoneExample  {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("갤럭시 S25", "BLACK");

        System.out.println("모델: " + myPhone.getModel());
        System.out.println("색상: " + myPhone.getColor());

        System.out.println("와이파이 상태: " + myPhone.isWifi());

        myPhone.bell();
        myPhone.sendVoice("여보세요");
        myPhone.receiveVoice("안녕하세요 저는 김자바 입니다");
        myPhone.hangUp();

        myPhone.setWifi(true);
        myPhone.internet();
    }
}
