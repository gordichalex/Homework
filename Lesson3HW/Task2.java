package Lesson3HW;

import java.util.Scanner;

public class Task2 {
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = 1;
        int b = 1;
        System.out.print(a + " " + b );
        int fib;
        for(int i = 2; i < n; i++) {
            fib = a + b;
            a = b;
            b = fib;
            System.out.print( " " + fib );
        }
    }



}
