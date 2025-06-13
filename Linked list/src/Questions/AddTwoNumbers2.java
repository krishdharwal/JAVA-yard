package Questions;
import Questions.Linkedlist.ListNode;


class AddTwoNumbers2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = reverse(l1);
        l2 = reverse(l2);

        ListNode head = new ListNode();
        ListNode tail = head;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0){
            int n1 = (l1 != null) ? l1.val : 0;
            int n2 = (l2 != null) ? l2.val : 0;

            int sum = n1 + n2 + carry;
            int rem = sum % 10;
            carry = sum / 10;

            tail.next = new ListNode(rem);
            tail = tail.next;

            l1 = (l1 != null) ? l1.next : l1;
            l2 = (l2 != null) ? l2.next : l2;
        }
        return reverse(head.next);
    }

    public ListNode reverse(ListNode curr){
        ListNode prev = null;
        ListNode fwd = curr.next;
        while (curr != null){
            curr.next = prev;
            prev = curr;
            curr = fwd;
            if (fwd != null) fwd = fwd.next;
        }
        return prev;
    }

}