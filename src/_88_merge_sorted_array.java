public class _88_merge_sorted_array {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1;
        int j = n - 1;
        int k = (m + n) - 1;
        while (k >= 0) {
            if (j < 0) {
                nums1[k] = nums1[i--];
            } else if (i < 0) {
                nums1[k] = nums2[j--];
            } else if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i--];
            } else {
                nums1[k] = nums2[j--];
            }
            k--;
        }
//        for (int x : nums2){
//            chen(x, nums1, m);
//            m++;
//        }
    }

    private static void chen(int x, int[] nums1, int m) {
        boolean check = false;
        for (int i = 0; i < m; i++) {
            if (nums1[i] > x) {
                check = true;
                for (int j = m - 1; j >= i; j--) {
                    nums1[j + 1] = nums1[j];
                }
                nums1[i] = x;
                break;
            }
        }
        if (!check) {
            nums1[m] = x;
        }
    }

    public static void main(String[] args) {
        int[] n1 = {1, 3, 4, 7, 0, 0, 0};
        int[] n2 = {2, 5, 6};
        merge(n1, 4, n2, 3);
    }
}
