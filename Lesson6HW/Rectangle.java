package Lesson6Homework;

public class Rectangle {
    Point a;
    Point b;
    Point c;
    Point d;

    public Rectangle(Point a, Point b, Point c, Point d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public static Rectangle createRectangle(Point x1y1, Point x2y2) {
        return new Rectangle(x1y1, new Point(x2y2.getX(), x1y1.getY()), x2y2, new Point(x1y1.getX(), x2y2.getY()));
    }

    public double getSquare() {
        return a.distanceTo(b) * a.distanceTo(d);
    }

    public double getDiagonal() {
        return a.distanceTo(c);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                '}';
    }
}