import java.util.Arrays;

public class MyQuckSort {
    static void quickSort(int[] a, int l, int r) {
        if (l >= r) return;
        int key = a[(l + r) / 2];
        int k = partition(a, l, r, key);
        quickSort(a, l, k - 1);
        quickSort(a, k, r);
    }

    public static int partition(int[] a, int l, int r, int key) {
        int il = l;
        int ir = r;
        while (il <= ir) {
            while (a[il] < key) il++;
            while (a[ir] > key) ir--;
            if (il <= ir) {
                int temp = a[il];
                a[il] = a[ir];
                a[ir] = temp;
                ir--;
                il++;
            }
        }
        return il;
    }

    public static void main(String[] args) {
        int[] a = {6, 7, 8, 5, 4, 1, 2, 3};
        quickSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }
}
