public class _896_Monotonic_Array {
    public static boolean isMonotonic(int[] nums) {
        if (nums[0] < nums[nums.length - 1]) {
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] < nums[i - 1]) {
                    return false;
                }
            }
        } else {
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] > nums[i - 1]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 3};
        int[] nums2 = {6, 5, 4, 4};
        int[] nums3 = {1, 3, 2};

        System.out.println(isMonotonic(nums1));
//        System.out.println(isMonotonic(nums2));
//        System.out.println(isMonotonic(nums3));
    }
}