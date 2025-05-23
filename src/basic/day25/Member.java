package src.basic.day25;

public class Member {
    public String name;
    public int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // hashCode 메소드 오버라이딩 - name 과 age 값이 같으면 동일한 hashCode 가 리턴
    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }

    // equals 메소드 오버라이딩 - name 과 age 값이 같으면 true 가 리턴
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member target) {
            return target.name.equals(name) && (target.age==age);
        } else {
            return false;
        }
    }
}
