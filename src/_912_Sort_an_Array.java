import java.util.Arrays;

public class _912_Sort_an_Array {

    public static int[] marge(int[] a1, int[] a2) {
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

    public static int[] mergeSort(int[] a, int l, int r) {
        if (l > r) return new int[0];
        if (l == r) {
            int[] singleElemen = {a[l]};
            return singleElemen;
        }

        int mid = (l + r) / 2;
        int[] a1 = mergeSort(a, l, mid);
        int[] a2 = mergeSort(a, mid + 1, r);

        return marge(a1, a2);
    }

    public static int[] sortArray(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }

    public static void main(String[] args) {
        int[] nums = {5, 3, 2, 7, 8, 1};
        System.out.println(Arrays.toString(sortArray(nums)));
    }
}
