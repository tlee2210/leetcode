import java.util.HashSet;
import java.util.Set;

public class _804_Unique_Morse_Code_Words {
    public static int uniqueMorseRepresentations(String[] words) {
        String[] morseCode = {
                ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---",
                ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."
        };
        Set<String> uniqueTransformations = new HashSet<>();

        for (String word : words) {
            StringBuilder morseWord = new StringBuilder();

            for (char c : word.toCharArray()) {
                morseWord.append(morseCode[c - 'a']);
            }

            uniqueTransformations.add(morseWord.toString());
        }

        return uniqueTransformations.size();
    }

    public static void main(String[] args) {
        String[] words = {"gin", "zen", "gig", "msg"};

        System.out.println(uniqueMorseRepresentations(words));
    }
}
