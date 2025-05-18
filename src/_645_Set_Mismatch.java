import java.util.Arrays;

public class _645_Set_Mismatch {
    public static int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        int n = nums.length;
        int[] freq = new int[n + 1];

        for (int num : nums) {
            freq[num]++;
        }

        for (int i = 1; i <= n; i++) {
            if (freq[i] == 2) {
                result[0] = i;
            }
            if (freq[i] == 0) {
                result[1] = i;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 4};

        System.out.println(Arrays.toString(findErrorNums(nums)));
    }
}
