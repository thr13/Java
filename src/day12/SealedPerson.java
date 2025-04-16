package src.day12;

/*
JAVA 15 부터 무분별한 자식 클래스 생성을 방지하기 위해 봉인된 클래스 (sealed 클래스) 가 도입됨
즉, 상속을 permits 으로 지정한 클래스들만 가능하고 그 외에는 자식 클래스를 만들 수 없도록 제한시킴
sealed class 클래스이름 permits 상속가능한 자식클래스

자식클래스는 final 또는 non-sealed 키워드를 사용하거나 sealed 키워드를 다시 사용해서 또 다른 봉인 클래스로 선언해야함
 */

public sealed class SealedPerson permits Employee, Manager {
    public String name;

    public void work() {
        System.out.println("하는 일이 결정되지 않았습니다");
    }
}
