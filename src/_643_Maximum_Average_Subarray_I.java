public class _643_Maximum_Average_Subarray_I {
    public static double findMaxAverage(int[] nums, int k) {
        int n = nums.length;

        double maxSum = 0;
        for (int i = 0; i < k; i++) {
            maxSum += nums[i];
        }

        double currentSum = maxSum;
        for (int i = k; i < n; i++) {
            currentSum += nums[i] - nums[i - k];
            maxSum = Math.max(currentSum, maxSum);
        }

        return maxSum / k;
    }

    public static void main(String[] args) {
        int[] nums = {1, 12, -5, -6, 50, 3};

        System.out.println(findMaxAverage(nums, 4));
    }
}
