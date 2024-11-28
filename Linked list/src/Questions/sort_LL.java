package Questions;

public class sort_LL {

     class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }


  // using fast and slow pointer technique and Merge sort algo
    public ListNode sortList(ListNode head) {
         if (head == null || head.next == null){
             return head;
         }
         // split it
         ListNode slow = head , fast = head , prev = null;

         while (fast != null && fast.next != null){
             prev = slow;
             slow = slow.next;
             fast = fast.next.next;

         }

         prev.next = null;
         return merge(head, slow);

    }

    public ListNode merge(ListNode first, ListNode second) {
         // join them
        ListNode head_temp = new ListNode(-1);
        ListNode tail_temp = head_temp;

        while (first != null && second != null){

            if (first.val < second.val) {
                tail_temp.next  = first;
                first = first.next;
            }
            else {
                tail_temp.next = second;
                second = second.next;
            }

        }

        // left over
        tail_temp.next = (first != null) ? first : second;
         return head_temp.next;
    }


//    public void  findMinTest(){
//         ListNode node = new ListNode(4);
//         node.next = new ListNode(2);
//         node.next.next = new ListNode(1);
//         node.next.next.next  = new ListNode(9);
//
//         ListNode ANS = findMax(node);
//        System.out.println(ANS.val);
//
//    }

    public void sort_test(){
        ListNode node = new ListNode(4);
         node.next = new ListNode(2);
         node.next.next = new ListNode(1);
         node.next.next.next  = new ListNode(9);

        ListNode n = sortList(node);
        ListNode temp = n;
        while (temp != null){
            System.out.println(temp.val);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
         sort_LL test = new sort_LL();
         test.sort_test();
    }
}
