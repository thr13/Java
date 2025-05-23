package src.basic.day12;

public class SealedExample {
    public static void main(String[] args) {
        SealedPerson person = new SealedPerson();
        Employee employee = new Employee();
        Manager manager = new Manager();
        Director director = new Director();

        person.work();
        employee.work();
        manager.work();
        director.work();
    }
}
