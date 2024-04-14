public class _367_Valid_Perfect_Square {
    public static boolean isPerfectSquare(int num) {
        int left = 1;
        int right = num;
        while (left <= right) {
            long mid = (left + right) / 2;
            long sqriMid = mid * mid;
            if (sqriMid == num) {
                return true;
            } else if (sqriMid > num) {
                right = (int) mid - 1;
            } else {
                left = (int) mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(14));
    }
}
