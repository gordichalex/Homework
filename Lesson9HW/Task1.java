package Lesson9;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args){
        ArrayList<String> objects = new ArrayList<>();
        objects.add("this");
        objects.add("is");
        objects.add("lots");
        objects.add("of");
        objects.add("fun");
        objects.add("for");
        objects.add("every");
        objects.add("Java");
        objects.add("programmer");

        System.out.println(objects);

        for(int i = 0; i < objects.size(); i++){
            if(objects.get(i).length() == 4){
                objects.add(i, "****");
                i++;
            }
        }
        System.out.println(objects);
    }
}
