import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _567_Permutation_in_String {
    public static boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int[] s1Freq = new int[26];
        int[] s2Freq = new int[26];

        for (char c : s1.toCharArray()) {
            s1Freq[c - 'a']++;
        }

        for (int i = 0; i < s1.length(); i++) {
            s2Freq[s2.charAt(i) - 'a']++;
        }

        for (int i = 0; i <= s2.length() - s1.length(); i++) {
            if (Arrays.equals(s1Freq, s2Freq)) {
                return true;
            }
            if (i < s2.length() - s1.length()) {
                s2Freq[s2.charAt(i) - 'a']--;
                s2Freq[s2.charAt(i + s1.length()) - 'a']++;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String s1 = "ab", s2 = "ab";
        System.out.println(checkInclusion(s1, s2));
    }
}
