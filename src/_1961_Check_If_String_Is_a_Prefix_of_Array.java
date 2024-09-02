import java.util.Arrays;

public class _1961_Check_If_String_Is_a_Prefix_of_Array {
    public static boolean isPrefixString(String s, String[] words) {
        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            sb.append(word);
            if (sb.length() >= s.length()) {
                break;
            }
        }

        return sb.toString().startsWith(s);
    }

    public static void main(String[] args) {
        String s = "iloveleetcode";
        String[] words = {"i", "love", "leetcode", "apples"};
        System.out.println(isPrefixString(s, words));
    }
}
