package lesson12;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

public class Task2 {
    private static int[] array = new int[20];
    private static Random random = new Random();

    private static void sortArray() {
        for (int i = 0; i < array.length; ++i) {
            array[i] = random.nextInt(50);
        }
        Arrays.sort(array);
    }

    public static void main(String[] args) {
        sortArray();
        try (FileWriter writer = new FileWriter("file.txt", false)) {
            for (int i = 0; i < array.length; ++i) {
                String string = Integer.toString(array[i]);
                writer.write(string);
                writer.write(System.lineSeparator());
                System.out.println(string);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
