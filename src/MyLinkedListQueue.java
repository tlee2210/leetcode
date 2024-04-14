public class MyLinkedListQueue implements IStackQueue {
    private class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    Node headNode, tailNode;

    public MyLinkedListQueue() {
        headNode = tailNode = null;
    }

    @Override
    public boolean push(int value) {
        if (isFull()) {
            return false;
        }
        Node newNode = new Node(value);
        if (isEmpty()) {
            headNode = tailNode = newNode;
        } else {
            tailNode.next = newNode;
            tailNode = newNode;
        }
        return true;
    }

    @Override
    public int pop() {
        if (isEmpty()) {
            return -1;
        }
        int value = headNode.val;
        if (headNode == tailNode) {
            headNode = tailNode = null;
        } else {
            headNode = headNode.next;
        }
        return value;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return (headNode == null) && (tailNode == null);
    }

    @Override
    public void show() {
        if (isEmpty()) {
            System.out.println("Empty");
        }
        Node currNode = headNode;
        while (currNode != null) {
            System.out.println(currNode.val + " ");
            currNode = currNode.next;
        }
    }
}
