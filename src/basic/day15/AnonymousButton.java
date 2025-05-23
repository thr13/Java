package src.basic.day15;

/*
중첩 인터페이스 예제인 ButtonExample 을 익명 구현 객체를 대입하도로 수정함
 */
public class AnonymousButton {
    public static void main(String[] args) {
        // OK 버튼 객체 생성
        Button btnOk = new Button();

        // OK 버튼 객체에 매개값으로 ClickListener() 구현 객체(익명 구현 객체)를 주입함
        btnOk.setClickListener(new Button.ClickListener() {
            @Override
            public void onClick() {
                System.out.println("Ok 버튼을 클릭했습니다");
            }
        });

        btnOk.click();

        // Cancel 버튼 객체 생성
        Button btnCancel = new Button();

        // Cancel 버튼 객체의 매개값으로 ClickListener() 구현 객체(익명 구현 객체)를 주입함
        btnCancel.setClickListener(new Button.ClickListener() {
            @Override
            public void onClick() {
                System.out.println("Cancel 버튼을 클릭했습니다");
            }
        });

        btnCancel.click();
    }
}
