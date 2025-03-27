public class _Demo_Recursion {

    public static int Giaithua(int n) {
        if (n == 0) return 1;

        return n * Giaithua(n - 1);
    }

    public static void main(String[] args) {

    }
}
