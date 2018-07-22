package lesson4;

public class Task1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int n = 1;
        int[] array2 = new int[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            if (i + n >= array.length) {
                array2[i + n - array.length] = array[i];
            } else {
                array2[i + n] = array[i];
            }
        }
        for (int i : array2) {
            System.out.print(i);
        }

    }
}
