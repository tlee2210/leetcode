public class _231_Power_of_Two {
    public static boolean isPowerOfTwo(int n) {
        if (n % 2 == 0 || n == 1)
            return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(16));
    }
}
