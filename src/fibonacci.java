public class fibonacci {

    public static int Fibo(int n) {
        if (n <= 2) return 1;

        return Fibo(n - 1) + Fibo(n - 2);
    }

    static int[] F = new int[1000];

    public static int Fibo1(int n) {
        if (F[n] != 0) return F[n];


        if (n <= 2) return 1;

        F[n] = Fibo(n - 1) + Fibo(n - 2);

        return F[n];
    }

    public static void main(String[] args) {
        int[] Fibo = new int[11];
        Fibo[1] = 1;
        Fibo[2] = 1;
        for (int i = 3; i <= 10; i++) {
            Fibo[i] = Fibo[i - 1] + Fibo[i - 2];
        }

        System.out.println(Fibo[10]);
    }
}
