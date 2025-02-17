public class _11_Container_With_Most_Water {
    public static int maxArea(int[] height) {
        int max = 0, curr = 0;
        int left = 0, right = height.length - 1;

        while (left < right) {
            curr = Math.min(height[left], height[right]);
            max = Math.max(max, curr * (right - left));
            while (left < right && height[left] <= curr)
                left++;
            while (left < right && height[right] <= curr)
                right--;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(nums));
    }
}
