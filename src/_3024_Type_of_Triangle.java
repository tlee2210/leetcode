import java.util.Arrays;

public class _3024_Type_of_Triangle {
    public static String triangleType(int[] nums) {
        Arrays.sort(nums);
        if (nums[0] + nums[1] <= nums[2])
            return "none";

        if (nums[0] == nums[1] && nums[1] == nums[2]) {

            return "equilateral";
        } else if (nums[0] == nums[1] || nums[1] == nums[2]) {

            return "isosceles";
        } else {

            return "scalene";
        }
    }

    public static void main(String[] args) {
        int[] nums = {3, 3, 3};

        System.out.println(triangleType(nums));
    }
}
