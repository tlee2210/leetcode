import java.util.Stack;

public class _1021_Remove_Outermost_Parentheses {
    public static String removeOuterParentheses(String s) {
//        Stack<Character> stack = new Stack<>();
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            if (stack.empty() || (c == '(' && stack.peek() == ')')) {
//                stack.push(c);
//            }
//            if (c == ')' && stack.peek() == '(') {
//                stack.push(c);
//            }
//        }
//        StringBuffer buffer = new StringBuffer();
//
//        for (int i = 0; i < stack.size(); i++) {
//            buffer.append(stack.get(i));
//        }
//        return buffer.toString();
        int index = 0;
        String t = null;
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(index) == '(' && s.charAt(i) == ')' && s.charAt(i - 1) != '(') && i % 2 == 0) {
                System.out.println(s.substring(index, i));
//                t += remove(s.substring(index, i));
            }
        }
        return t;
    }

    public static String remove(String s) {
        return s.substring(1, s.length() - 2);
    }

    public static void main(String[] args) {
        String s = "(()())(())(()(()))";
        System.out.println(removeOuterParentheses(s));

    }
}
