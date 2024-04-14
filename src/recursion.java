public class recursion {
    static int[] F = new int[31];

    public static int fib(int n) {
        if (F[n] != 0) return F[n];
        System.out.println("can tinh F[" + n + "]");
        if (n <= 1) {
            F[n] = n;
            return n;
        }
        F[n] = fib(n - 1) + fib(n - 2);
        return F[n];
    }

    public static void main(String[] args) {
//        System.out.println(fib(3));
        int[] Fibo = new int[11];
        Fibo[1] = 1;
        Fibo[2] = 1;
        for (int i = 3; i <= 10; i++) {
            Fibo[i] = Fibo[i - 1] + Fibo[i - 2];
        }
        System.out.println(Fibo[10]);
    }
}
