import java.util.HashMap;

public class _387_first_unique_character {
    public static int firstUniqChar(String s) {
        int[] count = new int[123];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int index = (int) c;
            count[index]++;
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int index = (int) c;
            if (count[index] == 1) {
                return i;
            }
        }
        return -1;

//        HashMap<Character, Integer> map = new HashMap<>();
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            if (map.containsKey(c)) {
//                map.put(c, map.get(c) + 1);
//            } else {
//                map.put(c, 1);
//            }
//        }
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            if (map.get(c) == 1) {
//                return i;
//            }
//        }
//        return -1;

    }

    public static void main(String[] args) {
        String s = "loveleetcode";
        System.out.println(firstUniqChar(s));
    }
}
