public class _485_Max_Consecutive_Ones {
    public int findMaxConsecutiveOnes(int[] nums) {
       int count = 0;
       int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 1){
                count++;
            } else {
                count = 0;
            }
            max = Math.max(max, count);
        }
        return max;
    }

    public static void main(String[] args) {
        _485_Max_Consecutive_Ones a = new _485_Max_Consecutive_Ones();
        int[] nums = {1, 1, 0, 1, 1, 1};
        System.out.println(a.findMaxConsecutiveOnes(nums));
    }
}
