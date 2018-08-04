package Lesson7HW;

public class Test {
    public static void main(String[] args) {

        Triangle abc = new Triangle(5, 3, 4);
        System.out.println(abc.getHeightTrSideB());
        System.out.println(abc.name());

        Square square = new Square(5);
        System.out.println(square.getSquare());

        Cube cube = new Cube(6);
        System.out.println(cube.getSquare());
        System.out.println(cube.name());

        Circle circle = new Circle(5);
        System.out.println(circle.getSquare());

        Rectangle rect = new Rectangle(3, 4);
        System.out.println(rect.Diagonal());
    }
}
