import java.lang.reflect.Array;
import java.util.Arrays;

public class _912_Sort_an_Array {
    public static int[] sort(int[] a1, int[] a2) {
        int n = a1.length + a2.length;
        int[] result = new int[n];
        int i = 0, i1 = 0, i2 = 0;
        while (i < n) {
            if (i1 < a1.length && i2 < a2.length) {
                if (a1[i1] < a2[i2]) {
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

    public static int[] mergesort(int[] nums, int l, int r) {
        if (l == r) return new int[]{nums[l]};
        int k = (l + r) / 2;
        int[] a = mergesort(nums, l, k);
        int[] b = mergesort(nums, k + 1, r);
        int[] result = sort(a, b);
        return result;
    }

    public static int[] sortArray(int[] nums) {
        return mergesort(nums, 0, nums.length - 1);
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 7};
        int[] nums1 = {2, 4, 6, 8};
        int[] nums2 = {1, 5, 3, 2, 8, 7, 6, 4};
//        System.out.println(Arrays.toString(sort(nums, nums1)));
        System.out.println(Arrays.toString(sortArray(nums2)));
//        System.out.println(Arrays.toString(mergesort(nums2, 0, nums2.length - 1)));
    }
}
