package src.basic.day20;

public class GetResourceExample {
    public static void main(String[] args) {
        // Class 객체에 담긴 상대경로를 이용해서 리소스의 절대경로 얻기
        Class clazz = Car.class;

        String photo1Path = clazz.getResource("photo1.png").getPath(); //photo1.png 가 있는 절대경로를 획득
        String photo2Path = clazz.getResource("images/photo2.png").getPath(); //photo2.png 가 있는 절대경로를 획득

        System.out.println(photo1Path);
        System.out.println(photo2Path);
    }
}
