public class _202_Happy_Number {
    public static boolean isHappy(int n) {
        int slow = n;
        int fast = getNextNumber(n);

        while (fast != 1 && slow != fast) {
            slow = getNextNumber(slow);
            fast = getNextNumber(getNextNumber(fast));
        }

        return fast == 1;
    }

    private static int getNextNumber(int num) {
        int totalSum = 0;
        while (num > 0) {
            int digit = num % 10;
            totalSum += digit * digit;
            num /= 10;
        }
        return totalSum;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }
}
