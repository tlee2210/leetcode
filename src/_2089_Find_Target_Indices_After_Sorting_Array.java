import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _2089_Find_Target_Indices_After_Sorting_Array {
    public static List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> integerList = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                integerList.add(i);
            }
        }

        return integerList;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 2, 3};

        System.out.println(targetIndices(nums, 2));

    }
}
