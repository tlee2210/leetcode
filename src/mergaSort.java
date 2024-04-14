import java.util.Arrays;

public class mergaSort {
    public static int[] sort(int[] a1, int[] a2) {
        int n = a1.length + a2.length;
        int[] result = new int[n];
        int i = 0, i1 = 0, i2 = 0;
        while (i < n) {
            if (i1 < a1.length && i2 < a2.length) {
                if (a1[i1] <= a2[i2]) {
                    result[i++] = a1[i1++];
                } else {
                    result[i++] = a2[i2++];
                }
            } else {
                if (i1 < a1.length) {
                    result[i++] = a1[i1++];
                } else {
                    result[i++] = a2[i2++];
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a1 = {1, 3, 5, 7, 9};
        int[] a2 = {2, 4, 6, 8};
        System.out.println(Arrays.toString(sort(a1, a2)));
    }
}
