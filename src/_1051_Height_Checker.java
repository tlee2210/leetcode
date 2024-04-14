public class _1051_Height_Checker {
    public static int heightChecker(int[] heights) {
        int n = heights.length;
        int[] copied = new int[n];
        for (int i = 0; i < n; i++) {
            copied[i] = heights[i];
        }
        for (int i = 1; i < n; i++) {
            int j = i - 1;
            int a = copied[i];
            while (j >= 0 && copied[j] > a) {
                copied[j + 1] = copied[j--];
            }
            copied[j + 1] = a;
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (heights[i] != copied[i]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 4, 2, 1, 3};
        System.out.println(heightChecker(nums));
    }
}
