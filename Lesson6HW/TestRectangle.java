package Lesson6Homework;

public class TestRectangle {
    public static void main(String[] args) {

        Point x1y1 = new Point(1, 1);
        Point x2y2 = new Point(4, 5);
        Rectangle rectangle = Rectangle.createRectangle(x1y1, x2y2);
        System.out.println(rectangle);
        System.out.println(rectangle.getSquare());
        System.out.println(rectangle.getDiagonal());
    }
}
