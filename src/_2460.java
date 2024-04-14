public class _2460 {
    public static int[] applyOperations(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] *= 2;
                nums[i + 1] = 0;
            }
        }
        int k = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[k++] = num;
            }
        }
        while (k < nums.length) {
            nums[k++] = 0;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 1, 1, 0};
        int[] nums1 = {1, 2};
        System.out.println(applyOperations(nums));
    }
}
