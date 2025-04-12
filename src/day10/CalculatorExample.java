package src.day10;

public class CalculatorExample {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int width = 5;
        int height = 4;

        calculator.areaRectangle(width);
        System.out.println("직사각형 넓이: " + calculator.areaRectangle(width, height));

        calculator.areaRectangle(width, height);
        System.out.println("정사각형 넓이: " + calculator.areaRectangle(width));
    }
}
