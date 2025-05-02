package src.day22;

/*
클래스의 상속관계
        Person
           ▲
           |
       /-----\
      |       |
   Worker   Student
               ▲
               |
            /-----\
           |       |
     HighStudent  MiddleStudent
 */
public class Person {
}

class Worker extends Person {

}

class Student extends Person {

}

class HighStudent extends Student {

}

class MiddleStudent extends Student {

}
