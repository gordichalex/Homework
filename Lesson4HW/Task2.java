package lesson4;

public class Task2 {
    public static void main(String[] args) {
        int a[] = {1, 2, 2, 5, 6, 5};
        System.out.print("массив до сортировки: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
        System.out.print("\nМассив после сортировки: ");

        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
        System.out.print("\nМассив после удаления дубликатов: ");
        int b = 0;
        a[b] = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[b] != a[i]) {
                b++;
                a[b] = a[i];
            }
        }
        for (int i = 0; i <= b; i++) {
            System.out.print(a[i]);
        }
    }
}
