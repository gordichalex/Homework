package Lesson2HW;

import java.util.Scanner;

public class Task1 {
    public static void main ( String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.println ("Введите число");
        int day = scanner.nextInt();
        System.out.println ("Введите месяц");
        int month = scanner.nextInt();
        System.out.println ("Введите год");
        int year = scanner.nextInt();

    if ((day == 28) && month == 2 && year%4 != 0) {
        day = 1; month ++;
        System.out.println("дата следующего дня: " + day + "." + month + "." + year);
    } else if (day == 29 && month == 2) {
        day = 1; month ++;
        System.out.println("дата следующего дня: " + day + "." + month + "." + year);
    } else if((day == 31) && (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10)) {
        day = 1; month ++;
        System.out.println("дата следующего дня: " + day + "." + month + "." + year);
    } else if((day == 30) && (month == 4 || month == 6 || month == 9 || month == 11)) {
        day = 1; month ++;
        System.out.println("дата следующего дня: " + day + "." + month + "." + year);
    } else if((day == 31) && month == 12) {
        day = 1; month =  1; year ++;
        System.out.println("дата следующего дня: " + day + "." + month + "." + year);
    } else {
        day ++;
        System.out.println("дата следующего дня: " + day + "." + month + "." + year);
    }

}

}
