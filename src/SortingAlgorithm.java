import java.util.Arrays;

public class SortingAlgorithm {
    public static void bubbleSort(int[] a) {
        int n = a.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

    }

    public static void main(String[] args) {
        int[] a = {5, 3, 2, 7, 8, 1};
        bubbleSort(a);
        System.out.println(Arrays.toString(a));
    }
}
