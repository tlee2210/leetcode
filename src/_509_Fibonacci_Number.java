public class _509_Fibonacci_Number {
    static int[] F = new int[31];

    public static int fib(int n) {
        if (F[n] != 0) {
            return F[n];
        }
        if (n <= 1) {
            F[n] = n;
            return n;
        }
        F[n] = fib(n - 1) + fib(n - 2);
        return F[n];
    }

    public static void main(String[] args) {
        System.out.println(fib(4));
    }
}
