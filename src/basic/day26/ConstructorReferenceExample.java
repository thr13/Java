package src.basic.day26;

public class ConstructorReferenceExample {
    public static void main(String[] args) {
        Person5 person5 = new Person5();

        // 생성자 참조1
        Member member1 = person5.getMember1(Member :: new);
        System.out.println(member1 + "\n");

        Member member2 = person5.getMember1((id) -> {return new Member(id);});
        System.out.println(member2 + "\n");

        // 생성자 참조2
        Member member3 = person5.getMember2(Member :: new);
        System.out.println(member3 + "\n");

        Member member4 = person5.getMember2((id, name) -> {return new Member(id, name);});
        System.out.println(member4 + "\n");
    }
}
