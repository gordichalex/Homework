package task18;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task18 {
    private static int i = 0;
    private static int daysNumber = 0;

    public static void main(String[] args) {
        String input = null;
        try {
            input = String.join("\n", Files.readAllLines(Paths.get("files", "log.txt")));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String[] days = input.split("\\n\\n");
        List<String> timeMatches = new ArrayList<>();
        StringBuffer stringBuffer = new StringBuffer();
        for (daysNumber = 0; daysNumber < days.length; daysNumber++) {
            stringBuffer.append("\n\n");
            Matcher matcher = Pattern.compile("(\\d\\d:\\d\\d)").matcher(days[daysNumber]);
            Matcher matcher1 = Pattern.compile("(\\d\\d:\\d\\d)").matcher(days[daysNumber]);
            while (matcher.find()) {
                timeMatches.add(matcher.group());
            }
            while (matcher1.find()) {
                if (i < timeMatches.size() - 1) {
                    matcher1.appendReplacement(stringBuffer, timeMatches.get(i) + "-" + timeMatches.get(i + 1));
                    i++;
                } else {
                    matcher1.appendReplacement(stringBuffer, timeMatches.get(i));
                    i++;
                }
            }
            matcher1.appendTail(stringBuffer);
        }
        System.out.println(stringBuffer);
        File file = new File("files/output.txt");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.append(stringBuffer.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}