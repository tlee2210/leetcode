public class _9_Palindrome_Number {
    public static boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        int num = 0;
        int y = x;
        while (y > 0) {
            num = num * 10 + y % 10;
            y /= 10;
        }
        return num == x;
    }

    public static void main(String[] args) {

        System.out.println(isPalindrome(121));
    }
}
