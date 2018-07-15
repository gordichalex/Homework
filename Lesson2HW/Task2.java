package Lesson2HW;

import java.util.Scanner;

public class Task2 {
    public static void main ( String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.println ("Введите a");
        int a = scanner.nextInt();
        System.out.println ("Введите b");
        int b = scanner.nextInt();
        System.out.println ("Введите c");
        int c = scanner.nextInt();
        System.out.println ("Введите d");
        int d = scanner.nextInt();
        System.out.println ("Введите e");
        int e = scanner.nextInt();
        System.out.println ("Введите f");
        int f = scanner.nextInt();

        if ((e >= (a+c)) && (f >= b && f >= d)) {
            System.out.println ("Помещаются 2 дома");

        } else if ((e >= (a + d)) && (f >= b && f >= c)) {
            System.out.println ("Помещаются 2 дома");
        } else if ((e >= (b + c)) && (f >= a && f >= d)) {
            System.out.println ("Помещаются 2 дома");
        } else if ((e >= (b + d)) && (f >= a && f >= c)) {
            System.out.println ("Помещаются 2 дома");
        } else if ((f >= (a + c)) && (e >= b && e >= d)) {
            System.out.println ("Помещаются 2 дома");
        } else if ((f >= (a + d)) && (e >= b && e >= c)) {
            System.out.println ("Помещаются 2 дома");
        } else if ((f >= (b + c)) && (e >= a && e >= d)) {
            System.out.println ("Помещаются 2 дома");
        } else if ((f >= (b + d)) && (e >= a && e >= c)) {
            System.out.println ("Помещаются 2 дома");
        } else {
            System.out.println ("Не помещается 2 дома"); }

    }

}


