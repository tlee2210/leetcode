public class _1295_find_numbers_with_even_number_of_digits {
    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int i :
                nums) {
            if (calculate(i) % 2 == 0) {
                count++;
            }
        }
        return count;
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
        int[] nums = {122, 2, 3172, 773, 2};
        System.out.println(findNumbers(nums));
    }
}
