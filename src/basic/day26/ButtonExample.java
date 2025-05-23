package src.basic.day26;

public class ButtonExample {
    public static void main(String[] args) {
        Button btnOk = new Button();

        // 객체에 람다식 주입 (ClickListener 익명 구현 객체 주입) - 매개값으로 람다식 대입
        btnOk.setClickListener(() -> {
            System.out.println("Ok 버튼을 클릭했습니다");
        });
        btnOk.click();
        
        Button btnCancel = new Button();
        
        // 객체에 람다식 주입 (ClickListener 익명 구현 객체 주입) - 매개값으로 람다식 대입
        btnCancel.setClickListener(() -> {
            System.out.println("Cancel 버튼을 클릭헀습니다");
        });
        btnCancel.click();
    }
}
