public class _1662_Check_If_Two_String_Arrays_are_Equivalent {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuffer r1 = new StringBuffer();
        StringBuffer r2 = new StringBuffer();

        for (String s : word1
        ) {
            r1.append(s);
        }

        for (String s : word2
        ) {
            r2.append(s);
        }

        return r2.toString().equals(r1.toString());
    }

    public static void main(String[] args) {
        String[] word1 = {"a", "bc"}, word2 = {"ab", "c"};
        System.out.println(arrayStringsAreEqual(word1, word2));
    }
}
