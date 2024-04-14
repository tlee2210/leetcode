public class _876_Middle_of_the_Linked_List {
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

    public static ListNode middleNode(ListNode head) {
        if (head == null) return null;
        ListNode currNode = head;
        ListNode midNode = head;
        while (currNode != null && currNode.next != null) {
            currNode = currNode.next.next;
            midNode = midNode.next;
        }
        return midNode;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        printLinkedList(n1);
        ListNode newlist = middleNode(n1);
        printLinkedList(newlist);
    }

}
