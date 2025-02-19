import java.util.Arrays;

public class _905_Sort_Array_By_Parity {
    public static int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] % 2 == 0) {
                int a = nums[index];
                nums[index] = nums[i];
                nums[i] = a;
                index++;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {3,1,2,4};
        System.out.println(Arrays.toString(sortArrayByParity(nums)));
    }
}
