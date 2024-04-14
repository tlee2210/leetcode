import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueJava {
    public static void main(String[] args) {
//        Stack
//        Stack<Integer> myStack = new Stack<>();
//        myStack.push(1);
//        myStack.push(2);
//        myStack.push(3);
//        for (Integer i : myStack){
//            System.out.println(i);
//        }
//        System.out.println();
//        System.out.println(myStack.pop());
//        System.out.println();
//
//        for (Integer i : myStack){
//            System.out.println(i);
//        }

        //Queue
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        for (Integer i : queue) {
            System.out.println(i);
        }
        queue.remove();
        for (Integer i : queue) {
            System.out.println(i);
        }
        System.out.println("peek: " + queue.peek());
    }
}
