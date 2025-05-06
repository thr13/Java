package src.day25;

public class Person implements Comparable<Person> {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Comparable<> 인터페이스 구현
    @Override
    public int compareTo(Person person) {
       if (age < person.age) {
           return -1;
       } else if (age == person.age) {
           return 0;
       } else
           return 1;
    }
}
