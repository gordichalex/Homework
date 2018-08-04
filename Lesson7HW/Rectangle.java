package Lesson7HW;

public class Rectangle extends Figure {
    private String FigureName = "Rectangle";
    private double sideA;
    private double sideB;

    @Override
    public double getSquare() {
        double square = sideA * sideB;
        return square;
    }

    @Override
    public String name() {
        return FigureName;
    }

    public double Diagonal() {
        double diagonal = Math.sqrt(sideA * sideA + sideB * sideB);
        return diagonal;
    }

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;


    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "FigureName='" + FigureName + '\'' +
                ", sideA=" + sideA +
                ", sideB=" + sideB +
                '}';
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }
}
