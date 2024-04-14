public class _83_Remove_Duplicates_from_Sorted_List {
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

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        ListNode currNode = head;
        while (currNode.next != null) {
            ListNode nextNode = currNode.next;
            if (currNode.val == nextNode.val) {
                if (nextNode.next == null) {
                    currNode.next = null;
                    break;
                } else {
                    currNode.next = nextNode.next;
                }
            } else {
                currNode = currNode.next;
            }
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
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(1);
        ListNode a3 = new ListNode(1);
//        ListNode a4 = new ListNode(3);
//        ListNode a5 = new ListNode(3);
        a1.next = a2;
        a2.next = a3;
//        a3.next = a4;
//        a4.next = a5;
        printLinkedList(a1);
        ListNode newlist = deleteDuplicates(a1);
        printLinkedList(newlist);
    }
}
