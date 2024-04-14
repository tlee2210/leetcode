import java.util.Arrays;

public class Sorting {
    public static int[] sort(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            boolean check = true;
            for (int j = 0; j < n - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    check = false;
                    int a = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = a;
                }
            }
            if (check) {
                break;
            }
            System.out.println(i + ": " + Arrays.toString(nums));
        }
        return nums;
    }

    public static int[] insertSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int a = nums[i];
            int j = i - 1;
            while (j >= 0 && nums[j] > a) {
                nums[j + 1] = nums[j--];
            }
            nums[j + 1] = a;
            System.out.println(i + ": " + Arrays.toString(nums));

        }
        return nums;
    }

    public static void SelectionSort(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (nums[j] < nums[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int t = nums[i];
                nums[i] = nums[min];
                nums[min] = t;
            }
            System.out.println(i + ": " + Arrays.toString(nums));
        }
    }

    public static void main(String[] args) {
        int[] nums = {7, 5, 1, 2, 3};
//        SelectionSort(nums);
//        sort(nums);
        insertSort(nums);

//        System.out.println(sort(nums));
    }
}
