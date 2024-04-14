public class Findmax {
    private static int max = -1;

    public static void FindMax1(int[] arr, int i) {
        if (i < arr.length) {
            if (arr[i] > max) {
                max = arr[i];
            }
            FindMax1(arr, i + 1);
        }
    }

    public static int FindMax2(int[] arr, int i, int previousMax) {
        if (i < arr.length) {
            int curMax = Math.max(previousMax, arr[i]);
            return FindMax2(arr, i + 1, curMax);
        }
        return previousMax;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 3, 4, 5, 6, 6, 3, 12, 1};
        FindMax1(arr, 0);
        System.out.println(max);
    }
}
