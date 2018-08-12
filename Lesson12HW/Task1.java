package lesson12;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws Exception {
        File file = Paths.get("poems", "poem.txt").toFile();
        Scanner scanner = new Scanner(new BufferedInputStream(new FileInputStream(file)));
        String letters = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] lettersArray = letters.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<>();
        for (int i = 0; i < lettersArray.length; i++) {
            alphabet.add(lettersArray[i]);
        }

        ArrayList<String> list = new ArrayList<String>();
        while (scanner.hasNextLine()) {
            String text = scanner.nextLine();
            list.add(text.toLowerCase());
        }

        for (Character character : alphabet) {
            int count = 0;
            for (String text : list) {
                for (int i = 0; i < text.length(); i++) {
                    if (text.charAt(i) == character) {
                        count++;
                    }
                }
            }
            System.out.println(character + " - " + count);
        }
    }
}





