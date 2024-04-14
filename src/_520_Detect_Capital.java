public class _520_Detect_Capital {
    public static boolean detectCapitalUse(String word) {
        int numberOfCapitals = 0;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) < 'A' || word.charAt(i) > 'Z') {
                continue;
            }

            numberOfCapitals++;
            if (numberOfCapitals != i + 1) {
                return false;
            }
        }
        return numberOfCapitals == 0 || numberOfCapitals == 1 || numberOfCapitals == word.length();
    }

    public static void main(String[] args) {
        String word = "FlaG";
        System.out.println(detectCapitalUse(word));
    }
}
