public class _844_Backspace_String_Compare {
    public static boolean backspaceCompare(String s, String t) {
        s = processString(s);
        t = processString(t);
        return s.equals(t);
    }

    private static String processString(String str) {
        StringBuffer sb = new StringBuffer();
        for (char c : str.toCharArray()) {
            if (c == '#') {
                if (sb.length() > 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        String s = "ab#c", t = "ad#c";

        System.out.println(backspaceCompare(s,t));
    }
}
