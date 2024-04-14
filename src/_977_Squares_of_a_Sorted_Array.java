import java.util.Arrays;

public class _977_Squares_of_a_Sorted_Array {
    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[nums.length];
        for (int i = 0; i < n; i++) {
            nums[i] = nums[i] * nums[i];
        }

        for (int i = 1; i < nums.length; i++) {
            int a = nums[i];
            int j = i - 1;
            while (j >= 0 && nums[j] > a) {
                nums[j + 1] = nums[j--];
            }
            nums[j + 1] = a;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {-7, -3, 2, 3, 11};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }
}
