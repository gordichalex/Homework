package lesson5;

import java.util.Scanner;

public class Task2 {
    static int max = 3999;
    static int numbers[] = {1, 4, 5, 9, 10, 50, 100, 500, 1000};
    static String RomanNumerals[] = {"I", "IV", "V", "IX", "X", "L", "C", "D", "M"};

    public static void main(String[] args) {

        System.out.println("Введите число в римском формате:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        boolean letter = false;
        for (int i = 0; i < RomanNumerals.length; i++)
            if (RomanNumerals[i].equals(input))
                letter = true;

        if (letter)
            System.out.println("Число в арабском форматеe = " + letterToNumber(input));
        else ;
    }

    private static int letterToNumber(String letter) {
        if (letter.equals("I"))
            return 1;
        else if (letter.equals("IV"))
            return 4;
        else if (letter.equals("V"))
            return 5;
        else if (letter.equals("IX"))
            return 9;
        else if (letter.equals("X"))
            return 10;
        else if (letter.equals("L"))
            return 50;
        else if (letter.equals("C"))
            return 100;
        else if (letter.equals("D"))
            return 500;
        else if (letter.equals("M"))
            return 1000;
        else return -1;
    }
}

