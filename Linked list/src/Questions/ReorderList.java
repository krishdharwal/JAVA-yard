package Questions;

import Questions.Linkedlist.ListNode;

// find mid
// split list then reverse the splited list
// merge both list
public class ReorderList {

    public void reorderList(ListNode head) {
         ListNode left = head;
         ListNode right = reverse(findMiddle(left));

         ListNode leftNext = left.next;
         ListNode rightNext = right.next;

         while (left != null || right != null){


             left = leftNext;
             right = rightNext;

             if (leftNext != null){
                 leftNext = leftNext.next;
             }

             if (rightNext != null){
                 rightNext = rightNext.next;
             }
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
