import java.util.Stack;

public class _682_Baseball_Game {
    public static int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("C")) {
                stack.pop();
            } else if (operations[i].equals("D")) {
                int num = stack.peek();
                stack.push(num * 2);
            } else if (operations[i].equals("+")) {
                int num1 = stack.pop();
                int num2 = stack.pop();
                stack.push(num2);
                stack.push(num1);
                stack.push(num1 + num2);
            } else {
                stack.push(Integer.parseInt(operations[i]));
            }
        }
        while (stack.size() > 0) {
            sum += stack.pop();
        }
        return sum;
    }

    public static void main(String[] args) {
        String[] a = {"5", "2", "C", "D", "+"};
        System.out.println(calPoints(a));
    }
}
