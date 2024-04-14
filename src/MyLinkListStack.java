import java.util.ArrayList;
import java.util.Arrays;

public class MyLinkListStack implements IStackQueue {
    private class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    Node topNode;

    public MyLinkListStack() {
        topNode = null;
    }

    @Override
    public boolean push(int value) {
        if (!isFull()) {
            Node newNode = new Node(value);
            newNode.next = topNode;
            topNode = newNode;
            return true;
        }
        return false;
    }

    @Override
    public int pop() {
        if (!isEmpty()) {
            int value = topNode.val;
            topNode = topNode.next;
            return value;
        }
        return -1;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return topNode == null;
    }

    @Override
    public void show() {
        if (isEmpty()) {
            System.out.println("empty");
        } else {
            Node temp = topNode;
            ArrayList<Integer> tempList = new ArrayList<>();
            while (temp != null) {
//                System.out.println(temp.val + " ");
                tempList.add(temp.val);
                temp = temp.next;
            }
            for (int i = tempList.size() - 1; i >= 0; i--) {
                System.out.println(tempList.get(i) + " ");
            }
            System.out.println();
        }
    }
}
