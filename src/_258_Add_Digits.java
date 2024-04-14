public class _258_Add_Digits {
    public static int addDigits(int num) {
        if (num < 10) return num;
        while (num >= 10) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }

    public static void main(String[] args) {
        int num = 10;
        System.out.println(addDigits(num));
    }
}
