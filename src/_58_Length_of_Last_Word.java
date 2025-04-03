public class _58_Length_of_Last_Word {
    public static int lengthOfLastWord(String s) {
        s = s.trim();
        int length = 0;
        int index = s.length() - 1;
        while (index >= 0 && s.charAt(index--) != ' ') {
            length++;
        }
        return length;
    }

    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(lengthOfLastWord(s));
    }
}
