public class _2006_Count_Number_of_Pairs_With_Absolute_Difference_K {
    public static int countKDifference(int[] nums, int k) {
        int count = 0, n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (Math.abs(nums[i] - nums[j]) == k) {
                    count += 1;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 1};


        System.out.println(countKDifference(nums, 1));
    }
}
