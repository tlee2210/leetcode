import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _448_Find_All_Numbers_Disappeared_in_an_Array {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> a = new ArrayList<>();
        for (int num : nums) {
            int index = Math.abs(num) - 1;
            nums[index] = -Math.abs(nums[index]);
        }
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] > 0) {
                a.add(i + 1);
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(Arrays.toString(new List[]{findDisappearedNumbers(nums)}));
    }
}
