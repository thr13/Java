package src.day11;

/*
상속은 이미 만들어진 클래스를 재사용해서 코드 중복성을 감소시킨다
상속의 이점은 클래스의 수정을 최소화 할 수 있다는 점 ->
'부모 클래스' 만 수정해도 이 클래스를 상속받는 자식 클래스 모두를 수정한 것과 동일한 효과를 가져오기 때문
-> 부모 클래스의 수정된 필드와 메소드를 가져다 사용하기 때문에 생산성을 향상시킬 수 있다
상속의 사용방법은 아래와 같다
접근제어자 class 자식클래스 extends 부모클래스 {
...
}
프로그램에서 상속은 자식이 부모를 선택한다 하지만 자바는 다른 언어와 달리 다중상속을 허용하지 않는다
그러므로 extends 뒤에 오는 부모클래스 는 단 하나만 올 수 있다
 */
public class Phone {
    private String model;
    private String color;

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void bell() {
        System.out.println("벨이 울립니다");
    }

    public void sendVoice(String message){
        System.out.println("나:" + message);
    }

    public void receiveVoice(String message){
        System.out.println("상대: " + message);
    }

    public void hangUp() {
        System.out.println("전화를 끊습니다");
    }

    Phone(String model, String color) {
        this.model = model;
        this.color = color;
    }
}
