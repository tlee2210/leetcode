public class _1816_Truncate_Sentence {
    public static String truncateSentence(String s, int k) {

        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                cnt++;
                if (cnt == k) {
                    s = s.substring(0, i);
                    break;
                }
            }
        }

        return s;
    }

    public static void main(String[] args) {
        String s = "Hello how are you Contestant";
        int k = 4;

        System.out.println(truncateSentence(s, k));
    }
}
