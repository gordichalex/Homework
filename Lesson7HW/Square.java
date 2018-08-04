package Lesson7HW;

public class Square extends Figure {
    private String FigureName = "Square";
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getSquare() {
        double square = side * side;
        return square;
    }

    @Override
    public String name() {
        return FigureName;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "Name='" + FigureName + '\'' +
                ", side=" + side +
                '}';
    }
}
