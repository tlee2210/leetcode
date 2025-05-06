import java.util.Arrays;

public class selectionSort {
    public static void selectionSort(int[] a) {
        int n = a.length;

        for (int i = 0; i < n; i++) {
            int min = i;

            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[min]) min = j;
            }

            if (min != i) {
                int t = a[i];
                a[i] = a[min];
                a[min] = t;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {5, 3, 2, 7, 8, 1};
        selectionSort(a);
        System.out.println(Arrays.toString(a));
    }
}
