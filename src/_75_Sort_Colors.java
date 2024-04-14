import java.util.Arrays;

public class _75_Sort_Colors {
    public static void sortColors(int[] nums) {
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            int j = i - 1;
            int a = nums[i];
            while (j >= 0 && nums[j] > a) {
                nums[j + 1] = nums[j--];
            }
            nums[j + 1] = a;
        }
    }

    public static void main(String[] args) {
        int[] nums = {2, 0, 1};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}
