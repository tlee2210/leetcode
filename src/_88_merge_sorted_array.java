import java.util.Arrays;

public class _88_merge_sorted_array {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int a :
                nums2) {
            chen(a, nums1, m);
            m++;
        }

    }

    private static void chen(int a, int[] nums1, int m) {
        boolean check = false;
        for (int i = 0; i < m; i++) {
            if (nums1[i] > a) {
                check = true;
                for (int j = m - 1; j >= i; j--) {
                    nums1[j + 1] = nums1[j];
                }
                nums1[i] = a;
                break;
            }
        }
        if (!check) {
            nums1[m] = a;
        }
    }


    public static void main(String[] args) {
        int[] n1 = {1, 3, 4, 7, 0, 0, 0};
        int[] n2 = {2, 5, 6};
        merge(n1, 4, n2, 3);
        System.out.println(Arrays.toString(n1));
    }
}
