package lesson4;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[][] array = { { 1, 2, 3, 4 }, { 1, 2, 3, 4,}};
        System.out.println(Arrays.toString(linearize(array)));
    }

    static public int[] linearize(int[][] array){

        int[] newArray = new int[array.length*array[0].length];

        for (int i = 0; i < array.length; ++i)
            for (int j = 0; j < array[i].length; ++j) {
                newArray[i*array[0].length+j] = array[i][j];
            }

        return newArray;
    }
}
