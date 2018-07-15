package Lesson2HW;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c, d;
        double x1, x2;
        System.out.println("Введите a");
        a = scanner.nextDouble();
        System.out.println("Введите b");
        b = scanner.nextDouble();
        System.out.println("Введите c");
        c = scanner.nextDouble();
        d = (b * b) - (4 * a * c);
        System.out.println("Дискриминант =" + d);

        if(d < 0) {
            System.out.println("Нет решения");
        } else if (d == 0) {
            x1 = (-b) / (2 * a);
            System.out.println("x = " + x1);
        } else {
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("x1 = " + x1 + " x2 = " + x2);

        }


    }


}
