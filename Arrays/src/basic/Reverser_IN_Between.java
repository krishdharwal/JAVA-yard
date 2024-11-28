package basic;

public class Reverser_IN_Between {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val,ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {

        ListNode prev = null;
        ListNode node = head;

        for (int i = 0; i < left ; i++) {
            prev = node;
            node = node.next;
        }
        // reverse it
        ListNode start_conn = prev;
        ListNode end_conn = node;

        ListNode temp = node.next;
        for (int i = 0; i < left - right + 1 && node !=null ; i++) {

                node.next = prev;
                prev = node;
                node = temp;
                if (temp.next != null) temp = temp.next;

        }

        start_conn.next = prev;
        end_conn.next = node;

        return head;

    }


}
