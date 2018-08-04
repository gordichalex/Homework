package Lesson7HW;

public class Triangle extends Figure {
    private String FigureName = "Triangle";
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double getSquare() {
        double semiPer = (sideA + sideB + sideC) / 2;
        double square = Math.sqrt(semiPer * (semiPer - sideA) * (semiPer - sideB) * (semiPer - sideC));
        return square;
    }

    @Override
    public String name() {
        return FigureName;
    }

    public double getPerimeter() {
        double perimeter = (sideA + sideB + sideC);
        return perimeter;
    }

    public double getHeightTrSideA() {
        double heightTriangleSideA = (2 * getSquare()) / sideA;
        return heightTriangleSideA;
    }

    public double getHeightTrSideB() {
        double heightTriangleSideB = (2 * getSquare()) / sideB;
        return heightTriangleSideB;
    }

    public double getHeightTrSideC() {
        double heightTriangleSideC = (2 * getSquare()) / sideC;
        return heightTriangleSideC;
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

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                '}';
    }
}
