package src.day26;

public class Person5 {
    public Member getMember1(Creatable1 creatable1) {
        String id = "winter";
        Member member = creatable1.create(id);
        return member;
    }

    public Member getMember2(Creatable2 creatable2) {
        String id = "winter";
        String name = "한겨울";
        Member member = creatable2.create(id, name);
        return member;
    }
}
