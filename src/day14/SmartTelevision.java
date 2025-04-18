package src.day14;

/*
다중 인터페이스 - 상속과 달리 인터페이스는 여러개 구현이 가능하다 implements 뒤에 , 로 구분함
 */
public class SmartTelevision implements RemoteControl, Searchable {

    // RemoteControl 인터페이스 구현체
    @Override
    public void turnOn() {
        System.out.println("TV 를 켭니다");
    }

    @Override
    public void turnOff() {
        System.out.println("TV 를 끕니다");
    }

    // Searchable 인터페이스 구현체
    @Override
    public void search(String url) {
        System.out.println(url + "을 검색합니다");
    }
}
