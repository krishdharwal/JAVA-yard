package Questions;

  public class ReverseKthGroup {
    public class ListNode {
      int val;
      public ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

  int forHeadShiftCount = 1;

    public ListNode reverseKGroup(ListNode head, int k) {
        // check for multiplicator or not
        int length = findLengthOfLL(head);
        if (length % k == 0) return head;

        int endPoint = length % k;
        return reverseLlFromK(head,k,endPoint);
    }


    public ListNode reverseLlFromK(ListNode head , int k, int end){
        {

            ListNode prev = null;
            ListNode node = head;

            for (int i = 0; i < end - 1; i++) {
                prev = node;
                node = node.next;
            }
            // reverse it````````
            ListNode start_conn = prev;
            ListNode end_conn = node;

            ListNode temp = node.next;
            for (int i = 0; i < k; i++) {
                node.next = prev;
                prev = node;
                node = temp;
                if (temp != null) temp = temp.next;
            }

            if (start_conn != null) {
                start_conn.next = prev;
            }else {
                head = prev;
            }

            if (node != null) {
                end_conn.next = node;
            }else {
                end_conn.next = null;
            }

            return head;
        }
    }

    public int findLengthOfLL(ListNode start){
        ListNode temp = start;
        int count = 0;
        while (temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }

      public static void main(String[] args) {

      }
  }
