public class _28_Find_the_Index_of_the_First_Occurrence_in_a_String {
    public static int strStr(String haystack, String needle) {
        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            String a = haystack.substring(i, i + needle.length());
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String haystack = "ttleetcode", needle = "leeto";
        System.out.println(strStr(haystack, needle));
    }
}
