package src.basic.day22;

/*
와일드카드 타입 파라미터: 타입 파라미터로 와일드카드(?) 를 사용하면 범위에 있는 모든 타입으로 대체할 수 있다
 */
public class Course {
    // 타입 파라미터 대체에 모든 타입 가능
    public static void registerCourse1(Applicant<?> applicant) {
        System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) Course1 을 등록함");
    }

    // Student 클래스 타입 및 Student 의 자식 클래스 타입만 타입 파라미터 대체 가능
    public static void registerCourse2(Applicant<? extends Student> applicant) {
        System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) Course2 을 등록함");
    }

    // Worker 클래스 타입 및 Worker 의 부모 클래스 타입만 타입 파라미터 대체 가능
    public static void registerCourse3(Applicant<? super Worker> applicant) {
        System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) Course3 을 등록함");
    }
}
