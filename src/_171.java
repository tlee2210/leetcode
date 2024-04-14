public class _171 {
    public static int titleToNumber(String columnTitle) {
        int result = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            int n = columnTitle.charAt(i) -64;
            result = result * 26 + n;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(titleToNumber("ABC"));
    }
}
