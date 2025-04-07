public class _168_Excel_Sheet_Column_Title {
    public static String convertToTitle(int columnNumber) {
        StringBuilder builder = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--;
            char c = (char) ('A' + columnNumber % 26);
            builder.insert(0, c);
            columnNumber /= 26;
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        System.out.println(convertToTitle(1));
    }
}
