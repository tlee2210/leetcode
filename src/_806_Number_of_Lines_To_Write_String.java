public class _806_Number_of_Lines_To_Write_String {
    public static int[] numberOfLines(int[] widths, String s) {
        int[] line = new int[2];
        line[0] = 1;

        for (char c : s.toCharArray()) {
            int width = widths[c - 'a'];
            if (line[1] + width > 100) {
                line[0]++;
                line[1] = width;
            } else {
                line[1] += width;
            }
        }

        return line;
    }

    public static void main(String[] args) {
        int[] widths = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        String s = "abcdefghijklmnopqrstuvwxyz";

        System.out.println(numberOfLines(widths, s));
    }
}
