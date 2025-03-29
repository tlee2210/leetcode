import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _228_Summary_Ranges {
    public static List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        if (nums.length == 0) {
            return list;
        }
        int index = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] != nums[i] - 1) {
                if (index == i - 1) {
                    list.add(String.valueOf(nums[index]));
                } else {
                    list.add(nums[index] + "->" + nums[i - 1]);
                }
                index = i;
            }
        }
        if (index == nums.length - 1) {
            list.add(String.valueOf(nums[index]));
        } else {
            list.add(nums[index] + "->" + nums[nums.length - 1]);
        }

        return list;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 4, 5, 7};
        System.out.println(Arrays.toString(new List[]{summaryRanges(nums)}));
    }
}
