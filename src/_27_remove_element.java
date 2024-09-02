public class _27_remove_element {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 3, 4};
        System.out.println(removeElement(a, 3));
    }

    private static int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}
