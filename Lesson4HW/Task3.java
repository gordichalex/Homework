package lesson4;

import java.util.Arrays;

public class Task3 {

    public static int[] concatArray(int[] a, int[] b) {
        if (a == null)
            return b;
        if (b == null)
            return a;
        int[] c = new int[a.length + b.length];
        System.arraycopy(a, 0, c, 0, a.length);
        System.arraycopy(b, 0, c, a.length, b.length);
        return c;
    }

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5};
        int[] b = {5, 6, 7};
        int[] c = concatArray(a, b);

        System.out.println(Arrays.toString(c));
    }
}










