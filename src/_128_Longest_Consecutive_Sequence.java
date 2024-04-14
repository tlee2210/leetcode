import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _128_Longest_Consecutive_Sequence {
    public static int longestConsecutive(int[] nums) {
        if (nums.length <= 1) return nums.length;
        Set<Integer> numSet = new HashSet<>();
        for (int i : nums
        ) {
            numSet.add(i);
        }
        int result = 0;
        for (int num : numSet) {
            System.out.println(numSet.contains(num - 1));
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                result = Math.max(result, currentStreak);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 0, 1};
        System.out.println(longestConsecutive(nums));
    }
}
