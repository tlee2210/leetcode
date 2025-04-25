import java.sql.Array;
import java.util.Arrays;

public class _1_Two_Sum {
    public static int[] twoSum(int[] nums, int target) {
        int l = nums.length;
        for (int i = 0; i < l; i++) {
            for (int j = i + 1; j < l; j++) {
                if (nums[i] + nums[j] == target) {

                    return new int[]{i, j};
                }
            }
        }

        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};

        int target = 9;

        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}
