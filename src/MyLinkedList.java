public class MyLinkedList {
    public static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public static void printLinkedList(Node head) {
        if (head == null) {
            System.out.println("List is empty!\n");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.value);
                temp = temp.next;
                if (temp != null) {
                    System.out.print("->");
                }
            }
            System.out.println("\n===============================");
        }
    }

    public static Node addToHead(Node headNode, int value) {
        Node newNode = new Node(value);
        if (headNode != null) {
            newNode.next = headNode;
        }
        return newNode;
    }

    public static Node addToTail(Node headNode, int value) {
        Node newNode = new Node(value);
        if (headNode == null) {
            return newNode;
        } else {
            Node lastNode = headNode;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
        }
        return headNode;
    }

    public static Node addToIndex(Node headNode, int value, int index) {
        if (index == 0) {
            return addToHead(headNode, value);
        } else {
            Node currNode = headNode;
            Node newNode = new Node(value);
            int count = 0;
            while (currNode != null) {
                count++;
                if (count == index) {
                    newNode.next = currNode.next;
                    currNode.next = newNode;
                    break;
                }
                currNode = currNode.next;
            }
        }
        return headNode;
    }

    public static Node removeAtHead(Node headNode) {
        if (headNode != null) {
            return headNode.next;
        }
        return null;
    }

    public static Node removeAtTail(Node headNode) {
        if (headNode == null) return null;
        Node lastNode = headNode;
        Node prevNode = null;
        while (lastNode.next != null) {
            prevNode = lastNode;
            lastNode = lastNode.next;
        }
        if(prevNode == null){
            return null;
        } else {
            prevNode.next = lastNode.next;
        }
        return headNode;
    }

    public static Node removeAtIndex(Node headNode, int index) {
        if (headNode == null || index < 0) return null;
        if (index == 0) {
            return removeAtHead(headNode);
        } else {
            Node currNode = headNode;
            Node prevNode = null;
            int count = 0;
            boolean BIsFound = false;
            while (currNode != null) {
                if (count == index) {
                    BIsFound = true;
                    break;
                }
                prevNode = currNode;
                currNode = currNode.next;
                count++;

            }
            if (BIsFound) {
                if (prevNode == null) {
                    return null;
                } else {
                    if (currNode != null) {
                        prevNode.next = currNode.next;
                    }
                }
            }

        }
        return headNode;
    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        n1.next = n2;
        n2.next = n3;
        printLinkedList(n1);
        n1 = removeAtTail(n1);
        printLinkedList(n1);
    }
}
