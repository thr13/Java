package src.basic.day12;

// non-sealed 클래스를 상속받는 자식클래스 (즉, Sealed 클래스를 조상클래스로 가지는 클래스)
public class Director extends Manager {

    @Override
    public void work() {
        System.out.println("제품을 기획합니다");
    }
}
