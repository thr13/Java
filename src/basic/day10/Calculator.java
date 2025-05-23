package src.basic.day10;

public class Calculator {

    // 메소드 오버로딩 - 정사각형 넓이
    double areaRectangle(double width) {
        return width * width;
    }

    // 메소드 오버로딩 - 직사각형 넓이
    double areaRectangle(double width, double height) {
        return width * height;
    }
}
