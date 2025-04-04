package Questions;
import Questions.Linkedlist.ListNode;
public class pairSum {
    public int pairSum(ListNode head) {
        if(head == null){
            return 0;
        }
        ListNode mid = mid(head);
        ListNode s = head;
        ListNode e = reverse(mid);
        int max = 0;

        while(s != null && e != null ){
            max = Math.max(max,s.val + e.val);
            s = s.next;
            e = e.next;
        }
        return max;
    }

    public ListNode mid(ListNode node){
        ListNode slow = node;
        ListNode fast = node;

        while(fast != null && fast.next != null){
            slow  = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode reverse(ListNode node){
        ListNode prev = null;
        ListNode curr = node;
        ListNode up = curr.next;

        while(curr != null){
            curr.next = prev;
            prev = curr;
            curr = up;
            if(up != null) up = up.next;
        }
        return prev;
    }
}
