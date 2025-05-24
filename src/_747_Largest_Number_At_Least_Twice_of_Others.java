public class _747_Largest_Number_At_Least_Twice_of_Others {
    public static int dominantIndex(int[] nums) {
        int n = nums.length, result = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[result]) {
                result = i;
            }
        }

        for (int i = 0; i < n; i++) {
            if (i != result) {
                int number = nums[i] * 2;
                if (nums[result] < number) {
                    return -1;
                }
            }
        }

        return result;
    }


    public static void main(String[] args) {
        int[] nums = {3, 6, 1, 0};

        System.out.println(dominantIndex(nums));
    }
}
