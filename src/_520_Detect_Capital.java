public class _520_Detect_Capital {
    public static boolean detectCapitalUse(String word) {

        return word.equals(word.toUpperCase()) ||
                word.equals(word.toLowerCase()) ||
                (Character.isUpperCase(word.charAt(0)) && word.substring(1).equals(word.substring(1).toLowerCase()));
    }


    public static void main(String[] args) {
        String w = "FlaG";
        System.out.println(detectCapitalUse(w));
    }
}
