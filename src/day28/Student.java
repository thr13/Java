package src.day28;

public class Student implements Comparable<Student> {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public int compareTo(Student student) {
        // 필드 score 와 매개값인 student 객체의 score 가 같을 경우 0, 작으면 음수, 크면 양수 리턴
        return Integer.compare(score, student.score);
    }
}
