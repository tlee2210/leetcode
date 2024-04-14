import java.util.Stack;

public class _2696_Minimum_String_Length_After_Removing_Substrings {
    public static int minLength(String s) {
//        while ((s.indexOf("AB", 0, s.length()) != -1) || (s.indexOf("CD", 0, s.length()) != -1)) {
//            if (s.indexOf("AB", 0, s.length()) != -1) {
//                int sub = s.indexOf("AB", 0, s.length());
//                if (sub == 0) {
//                    s = s.substring(2, s.length());
////                    System.out.println(s);
//                } else if (sub + 2 == s.length()) {
//                    s = s.substring(0, sub);
////                    System.out.println(s);
//                } else {
//                    String first = s.substring(0, sub);
//                    String secon = s.substring(sub + 2, s.length());
//                    s = first + secon;
////                    System.out.println(s);
//                }
//            }
//            if (s.indexOf("CD", 0, s.length()) != -1) {
//                int sub = s.indexOf("CD", 0, s.length());
//                if (sub == 0) {
//                    s = s.substring(2, s.length());
////                    System.out.println(s);
//                } else if (sub + 2 == s.length()) {
//                    s = s.substring(0, sub);
////                    System.out.println(s);
//                } else {
//                    String first = s.substring(0, sub);
//                    String secon = s.substring(sub + 2, s.length());
//                    s = first + secon;
////                    System.out.println(s);
//                }
//            }
//        }
//        return s.length();

        char[] arr = new char[s.length()];
        int i = -1;
        for(char ch : s.toCharArray()) {
            if(i >= 0 &&((ch == 'B' && arr[i] == 'A') || (ch == 'D' && arr[i] == 'C'))) {
                i--;
            } else {
                arr[++i] = ch;
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        String s = "ACBBD";
        System.out.println(minLength(s));
    }
}
