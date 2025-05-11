import java.util.Arrays;

public class _561_Array_Partition {
    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length - 1; i = i + 2) {
            sum = sum + Math.min(nums[i], nums[i + 1]);
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {6, 2, 6, 5, 1, 2};

        System.out.println(arrayPairSum(nums));
    }
}
