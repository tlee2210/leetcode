public class _28_find_the_index {
    public static int strStr(String haystack, String needle) {
        int length = haystack.length() - needle.length() + 1;
        System.out.println(length);
        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            if(haystack.substring(i , i + needle.length()).equals(needle)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String a = "abc";
        String b = "c";
        System.out.println(strStr(a, b));
    }
}
