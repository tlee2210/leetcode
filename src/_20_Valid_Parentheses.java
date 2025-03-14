import java.util.Stack;

public class _20_Valid_Parentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty())
                    return false;
                char open = stack.peek();
                if ((c == ')' && open == '(') || (c == '}' && open == '{') || (c == ']' && open == '[')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty() ? true : false;
    }

    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(isValid(s));
    }
}
