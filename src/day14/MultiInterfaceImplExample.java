package src.day14;

public class MultiInterfaceImplExample {
    public static void main(String[] args) {
        // RemoteControl 인터페이스 에 구현체 SmartTelevision 생성 후 대입
        RemoteControl rc = new SmartTelevision();
        rc.turnOn();
        rc.turnOff();

        //  Searchable 인터페이스 에 구현체 SmartTelevision 생성 후 대입
        Searchable searchable = new SmartTelevision();
        searchable.search("https://www.youtube.com");
    }
}
