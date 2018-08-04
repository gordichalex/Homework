package Lesson7HW;

public class Cube extends Square {
    private String FigureName = "Cube";

    public Cube(double side) {
        super(side);
    }

    @Override
    public double getSquare() {
        double square = getSide() * getSide() * 6;
        return square;
    }

    @Override
    public String name() {
        return FigureName;
    }

    @Override
    public double getSide() {
        return super.getSide();
    }

    @Override
    public void setSide(double side) {
        super.setSide(side);
    }

    @Override
    public String toString() {
        return "Cube{" +
                "Name='" + FigureName + '\'' +
                '}';
    }
}
