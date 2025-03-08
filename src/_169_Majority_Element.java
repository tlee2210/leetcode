import java.util.HashMap;

public class _169_Majority_Element {
    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        int majorityCount = 0;
        int majorityElement = 0;
        for (int num : nums) {
            if (map.get(num) > majorityCount) {
                majorityCount = map.get(num);
                majorityElement = num;
            }
        }

        return majorityElement;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement(nums));
    }
}
