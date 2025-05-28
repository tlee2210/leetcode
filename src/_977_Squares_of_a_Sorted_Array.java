public class _977_Squares_of_a_Sorted_Array {
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        int il = 0;
        int ir = nums.length - 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            int v = Math.abs(nums[il]) > Math.abs(nums[ir]) ? nums[il++] : nums[ir--];
            ans[i] = v * v;
        }

        return ans;
    }


    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};
        _977_Squares_of_a_Sorted_Array na = new _977_Squares_of_a_Sorted_Array();

        System.out.println(na.sortedSquares(nums));
    }
}
