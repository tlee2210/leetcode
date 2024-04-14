public class _203_Remove_Linked_List_Elements {
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

    public static ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
        ListNode currNode = head;
        ListNode prevNode = null;

        while (currNode != null) {
            if (currNode.val == val) {
                if (prevNode == null) {
                    head = currNode.next;
                } else {
                    currNode.next = prevNode.next;
                }
            } else {
                prevNode = currNode;
            }
            currNode = currNode.next;
        }
        return head;
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
        ListNode n1 = new ListNode(7);
        ListNode n2 = new ListNode(7);
        ListNode n3 = new ListNode(7);
        ListNode n4 = new ListNode(7);
//        ListNode n5 = new ListNode(4);
//        ListNode n6 = new ListNode(5);
//        ListNode n7 = new ListNode(6);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
//        n4.next = n5;
//        n5.next = n6;
//        n6.next = n7;

        printLinkedList(n1);
        ListNode newlist = removeElements(n1, 7);
        printLinkedList(newlist);
    }
}
