import java.util.Arrays;

public class _1089_Duplicate_Zeros {
    public static void duplicateZeros(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == 0) {
                int a = arr[i + 1];
                for (int j = i + 2; j < n; j++) {
                    int temp = arr[j];
                    arr[j] = a;
                    a = temp;
                }
                arr[++i] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 0, 2, 3, 0, 4, 5, 0};
        duplicateZeros(nums);
        System.out.println(Arrays.toString(nums));
    }
}
