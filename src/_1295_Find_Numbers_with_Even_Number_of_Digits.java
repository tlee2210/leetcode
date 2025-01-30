public class _1295_Find_Numbers_with_Even_Number_of_Digits {
    public static int findNumbers(int[] nums) {
        int cnt = 0;

        for (int i : nums) {
            if (calculate(i) % 2 == 0) {
                cnt++;
            }
        }

        return cnt;
    }

    private static int calculate(int a) {
        int count = 0, result = a;
        while (result != 0) {
            result = a / 10;
            a = result;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {555, 901, 482, 1771};
        System.out.println("result: " + findNumbers(nums));
    }
}
