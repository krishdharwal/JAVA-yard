package Questions;

public class HasCycle {


    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }


        public boolean hasCycle(ListNode head) {
            if (head.next == null){
                return false;
            }
            ListNode s = head;
            ListNode f = head.next;

            while (f != null || f.next != null){

                if(s == f){
                    return true;
                }

                s = s.next;
                if ( f.next != null ) f = f.next.next;

            }
            return false;

        }

}
