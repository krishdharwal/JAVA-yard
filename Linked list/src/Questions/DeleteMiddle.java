package Questions;
import Questions.Linkedlist.ListNode;


public class DeleteMiddle {

        public ListNode deleteMiddle(ListNode head) {
            if(head == null || head.next == null){
                return null;
            }
            ListNode midPrev = findMidPrev(head);
            midPrev.next = midPrev.next.next;
            return head;
        }

        public ListNode findMidPrev(ListNode head){
            ListNode slow = head;
            ListNode fast = head.next.next;

            while(fast != null && fast.next != null){
                slow  = slow.next;
                fast = fast.next.next;
            }

            return slow;
        }

}
