import java.util.Stack;

public class _232_Implement_Queue_using_Stacks {
    Stack<Integer> stack;

    public _232_Implement_Queue_using_Stacks() {
        stack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
    }

    public int pop() {
        if (stack.empty()) return -1;
        return stack.remove(0);
    }

    public int peek() {
        if (stack.empty()) return -1;
        return stack.get(0);
    }

    public boolean empty() {
        return stack.isEmpty();
    }
}
