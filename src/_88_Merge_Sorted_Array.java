public class _88_Merge_Sorted_Array {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int a : nums2) {
            chen(a, nums1, m);
            m++;
        }
    }


    public static void chen(int a, int[] nums1, int m) {
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
        int[] num1 = {1, 2, 3, 0, 0, 0}, num2 = {2, 5, 6};
        merge(num1, 3, num2, 3);
    }
}
