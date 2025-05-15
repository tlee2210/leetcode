import java.util.Arrays;

public class _628_Maximum_Product_of_Three_Numbers {
    public static int maximumProduct(int[] nums) {
        int n = nums.length;

        Arrays.sort(nums);

        return Math.max(nums[n - 1] * nums[n - 2] * nums[n - 3], nums[0] * nums[1] * nums[n - 1]);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};

        System.out.println(maximumProduct(nums));
    }
}
