package Lesson10HW.Task1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        String textorig = new String("I usually have four meals a day. In the morning I have breakfast. At school I have lunch. At home I have dinner and in the evening I have supper. Besides, I like to eat an apple or a banana, or to drink a glass of juice between meals, if I’m thirsty.");
        String[] textR = textorig.split("[.,\\s]");
        List<String> list = Arrays.asList(textR);

        Map<String, Integer> map = new HashMap<>();
        for (String string : list) {
            if (map.keySet().contains(string)) {
                map.put(string, map.get(string) + 1);
            } else {
                map.put(string, 1);
            }
        }
        System.out.println(map);
    }
}
