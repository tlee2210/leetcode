public class _844_Backspace_String_Compare {
    public boolean backspaceCompare(String s, String t) {
        s = processString(s);
        t = processString(t);
        return s.equals(t);
    }

    private String processString(String str) {
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

}
