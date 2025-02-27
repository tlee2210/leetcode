public class _66_Plus_One {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        digits[n - 1] += 1;
        for (int i = n - 1; i > 0; i--) {
            if (digits[i] > 9) {
                digits[i] = 0;
                digits[i - 1] += 1;
            }
        }
        if (digits[0] > 9) {
            int[] result = new int[n + 1];
            result[0] = 1;
            return result;
        }
        return digits;
    }

    public static void main(String[] args) {
        int[] digits = {1, 2, 3};
        System.out.println(plusOne(digits));
    }
}
