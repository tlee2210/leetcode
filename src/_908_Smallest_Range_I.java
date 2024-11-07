public class _908_Smallest_Range_I {
    public static int smallestRangeI(int[] nums, int k) {
        int minVal = Integer.MAX_VALUE;
        int maxVal = Integer.MIN_VALUE;

        for (int num : nums) {
            minVal = Math.min(minVal, num);
            maxVal = Math.max(maxVal, num);
        }

        int adjustedDifference = (maxVal - k) - (minVal + k);

        return Math.max(0, adjustedDifference);
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 6};
        int k = 3;
        System.out.println(smallestRangeI(nums, k));
    }
}
