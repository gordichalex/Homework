package Lesson7HW;

public class Circle extends Figure {
    private String FigureName = "Circle";
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getLengthCircle() {
        double length = 2 * Math.PI * radius;
        return length;
    }

    @Override
    public double getSquare() {
        double square = Math.PI * radius * radius;
        return square;
    }

    @Override
    public String name() {
        return FigureName;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "FigureName='" + FigureName + '\'' +
                ", radius=" + radius +
                '}';
    }
}
