public class _136_Single_Number {
    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int ai : nums) {
            result ^= ai;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        System.out.println(singleNumber(nums));
    }
}
