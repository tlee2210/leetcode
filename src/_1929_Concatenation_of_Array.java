public class _1929_Concatenation_of_Array {
    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n * 2];
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 1};

        System.out.println(getConcatenation(nums));
    }
}
