public class _2351_first_letter {
    public static char repeatedCharacter(String s) {
        char[] arr = s.toCharArray();
        int[] count = new int[123];
        for (int i = 0; i < arr.length; i++) {
            int index = (int) arr[i];
            count[index]++;
            if (count[index] >= 2) {
                return arr[i];
            }
        }
        return arr[0];
    }

    public static void main(String[] args) {
        String s = "abccbaacz";
        System.out.println(repeatedCharacter(s));
    }
}
