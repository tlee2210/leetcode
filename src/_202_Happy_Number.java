public class _202_Happy_Number {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = getNextNumber(n);

        while (fast != 1 && slow != fast) {
            slow = getNextNumber(slow);
            fast = getNextNumber(getNextNumber(fast));
            System.out.println("sout: " + slow);
            System.out.println("fast: " + fast);
            System.out.println("====================");
        }

        return fast == 1;
    }

    private int getNextNumber(int num) {
        int totalSum = 0;
        while (num > 0) {
            int digit = num % 10;
            totalSum += digit * digit;
            num /= 10;
        }
        return totalSum;
    }

    public static void main(String[] args) {
        _202_Happy_Number happyNumber = new _202_Happy_Number();
        int n = 2;
        System.out.println(happyNumber.isHappy(n)); // Output: true
    }
}
