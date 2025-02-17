package Questions;

import Questions.Linkedlist.ListNode;

// find mid
// split list then reverse the splited list
// merge both list
public class ReorderList {

    public void reorderList(ListNode head) {
        ListNode mid = findMiddle(head);

        ListNode Head_first = head;
        ListNode Head_second = reverse(mid);
        while (Head_first != null && Head_second != null) {
            ListNode temp = Head_first.next;
            Head_first.next = Head_second;
            Head_first = temp;

            temp = Head_second.next;
            Head_second.next = Head_first;
            Head_second = temp;
        }
        if (Head_first != null) {
            Head_first.next = null;
        }
    }


     // find mid
    public ListNode findMiddle(ListNode node){
        ListNode slow = node;
        ListNode fast = node;

        while ( fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // reverse ll
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = curr.next;

        while (curr != null){
            curr.next = prev;
            prev = curr;
            curr = next;
            if (next != null) {
                next = next.next;
            }
        }

    return prev;

    }


}
