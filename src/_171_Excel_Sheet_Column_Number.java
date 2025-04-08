public class _171_Excel_Sheet_Column_Number {
    public static int titleToNumber(String columnTitle) {
        int result = 0;

        for (int i = 0; i < columnTitle.length(); i++) {
            char ch = columnTitle.charAt(i);
            result = result * 26 + (ch - 'A' + 1);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(titleToNumber("AB"));
    }
}
