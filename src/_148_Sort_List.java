public class _148_Sort_List {
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

    public static ListNode sortList(ListNode head) {
        if (head == null) return null;
        int temp;
        ListNode currNode = head;
        ListNode indexNode = null;
        while (currNode != null) {
            indexNode = currNode.next;
            while (indexNode != null) {
                if (currNode.val > indexNode.val) {
                    temp = currNode.val;
                    currNode.val = indexNode.val;
                    indexNode.val = temp;
                }
                indexNode = indexNode.next;
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
        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(1);
        ListNode node4 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        ListNode newList = sortList(node1);
        printLinkedList(newList);
    }
}
