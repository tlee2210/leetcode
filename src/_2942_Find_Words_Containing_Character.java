import java.util.ArrayList;
import java.util.List;

public class _2942_Find_Words_Containing_Character {
    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].indexOf(x) != -1) {
                integerList.add(i);
            }
        }
        return integerList;
    }

    public static void main(String[] args) {
        String[] strings = {"leet", "code"};
        char x = 'e';
        System.out.println(findWordsContaining(strings, x).toString());
    }
}
