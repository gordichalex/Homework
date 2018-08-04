package Lesson6Homework;

public class Demo {
    public static void main(String[] args) {
        Point a = new Point(0, 5);
        Point b = new Point(0, 0);

        a.distanceTo(b);
        System.out.println(a.distanceTo(b));
    }
}
