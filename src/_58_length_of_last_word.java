public class _58_length_of_last_word {
    public static int lengthOfLastWord(String s) {
        s = s.trim();
        int length = 0;
        int index = s.length() - 1;
        while (index >= 0 && s.charAt(index--) != ' '){
            length++;
        }
        return length;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
    }
}
