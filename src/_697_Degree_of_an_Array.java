import java.util.HashMap;
import java.util.Map;

public class _697_Degree_of_an_Array {

    public static int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<>();
        Map<Integer, Integer> first = new HashMap<>();

        int min_length = 0;
        int degree = 0;

        for (int i = 0; i < nums.length; i++) {
            first.putIfAbsent(nums[i], i);
            counts.put(nums[i], counts.getOrDefault(nums[i], 0) + 1);

            if (counts.get(nums[i]) > degree) {
                degree = counts.get(nums[i]);
                min_length = i - first.get(nums[i]) + 1;
            } else if (counts.get(nums[i]) == degree) {
                min_length = Math.min(min_length, i - first.get(nums[i]) + 1);
            }
        }

        return min_length;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 1};

        System.out.println(findShortestSubArray(nums));
    }
}
