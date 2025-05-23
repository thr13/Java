package src.basic.day26;

public class MethodReferenceExample2 {
    public static void main(String[] args) {
        Person4 person4 = new Person4();

        /*
        (a,b) -> a.compareToIgnoreCase(b) 와 같다
        여기서 참조되는 것은 String 클래스의 compareToIgnoreCase() 메소드이다
        */
        person4.ordering(String :: compareToIgnoreCase);
    }
}
