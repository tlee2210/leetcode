public class _205_Isomorphic_Strings {
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] m1 = new int[256];
        int[] m2 = new int[256];
        for (int i = 0; i < s.length(); i++) {
            if (m1[s.charAt(i)] != m2[t.charAt(i)]) return false;

            System.out.println("m1[" + s.charAt(i) + "] = " + m1[s.charAt(i)]);
            System.out.println("m2[" + t.charAt(i) + "] = " + m2[t.charAt(i)]);
            System.out.println("==================");
            System.out.println("==================");
            m1[s.charAt(i)] = i + 1;
            m2[t.charAt(i)] = i + 1;
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "egg", t = "add";

        System.out.println(isIsomorphic(s, t));
    }
}
