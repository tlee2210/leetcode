public class _206_Reverse_Linked_List {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode reverseList(ListNode head) {
        ListNode currNode = head;
        while (currNode != null && currNode.next != null) {
            ListNode nextNode = currNode.next;
            currNode.next = nextNode.next;
            nextNode.next = head;
            head = nextNode;
        }
        return head;
    }

    public static ListNode reverseList1(ListNode head) {
        if (head == null) return null;
        ListNode nextNode = head.next;
        if (nextNode == null) return head;

        ListNode newNode = reverseList1(nextNode);
        nextNode.next = head;
        head.next = null;
        return newNode;
    }


    public static void printLinkedList(ListNode head) {
        if (head == null) {
            System.out.println("List is empty!\n");
        } else {
            ListNode temp = head;
            while (temp != null) {
                System.out.print(temp.val);
                temp = temp.next;
                if (temp != null) {
                    System.out.print("->");
                }
            }
            System.out.println("\n===============================");
        }
    }

    public static void main(String[] args) {
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(3);
        a1.next = a2;
        a2.next = a3;
        printLinkedList(a1);
        ListNode newlist = reverseList(a1);
        printLinkedList(newlist);
    }
}
