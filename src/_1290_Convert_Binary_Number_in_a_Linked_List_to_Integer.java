public class _1290_Convert_Binary_Number_in_a_Linked_List_to_Integer {
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

    public static int getDecimalValue(ListNode head) {
        int result = 0;
        while (head != null) {
            result = result * 2 + head.val;
            head = head.next;
        }
        return result;
    }

    public static void main(String[] args) {
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(0);
        ListNode a3 = new ListNode(1);
        a1.next = a2;
        a2.next = a3;
        int nums = getDecimalValue(a1);
        System.out.println(nums);

    }

}
