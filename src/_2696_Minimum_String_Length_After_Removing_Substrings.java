public class _2696_Minimum_String_Length_After_Removing_Substrings {
    public static int minLength(String s) {
        char[] arr = new char[s.length()];
        int i = -1;
        for (char ch : s.toCharArray()) {
            if (i >= 0 && ((ch == 'B' && arr[i] == 'A') || (ch == 'D' && arr[i] == 'C'))) {
                i--;
            } else {
                arr[++i] = ch;
            }
        }

        return i + 1;
    }


    public static void main(String[] args) {
        String s = "ABFCACDB";

        System.out.println(minLength(s));
    }
}
