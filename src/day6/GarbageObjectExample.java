package src.day6;

public class GarbageObjectExample {
    public static void main(String[] args) {
        /*
        자바는 힙 메모리에 존재하지만 위치 정보(번지)를 모르기 때문에 사용할 수 없는 객체들을 쓰레기로 취급함
        Garbage Collector 는 이 쓰레기를 자동으로 제거함
         */
        String hobby = "여행";
        hobby = null; // "여행" 에 해당하는 String 객체를 쓰레기로 만듦

        String kind1 = "자동차";
        String kind2 = kind1; // String 객체변수 kind1 에 저장되어 있는 번지를 kind2 객체변수에 대입함
        kind1 = null; // "자동차" 에 해당하는 String 객체는 쓰레기가 아님 왜냐하면 kind2 가 "자동차" 에 해당하는 번지를 참조하고 있기 때문
        System.out.println("kind2: " + kind2);
    }
}
