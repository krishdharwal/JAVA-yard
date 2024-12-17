package Questions;

  public class ReverseKthGroup {
    public class ListNode {
      int val;
      public ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

          public ListNode reverseKGroup(ListNode head, int k) {

              if (k <= 1 && head == null) {
                  return head;
              }
              ListNode previous = null;
              ListNode current = head;

              // this used for to iterate only this times
              int iterator = findLengthOfLL(head) / k;

              while(current != null && iterator > 0){
                  ListNode last_connector = previous;
                  ListNode new_end = current;
                  ListNode next = current.next;


                  for (int i = 0; i < k && current != null; i++) {
                      current.next = previous;
                      previous = current;
                      current = next;
                      if (next != null){
                          next = next.next;
                      }
                  }

                  iterator--;

                  if (last_connector != null) {
                      last_connector.next = previous;
                  }
                  else { // means that there is no last end connector
                      head = previous;
                  }
                  new_end.next = current;

                  // update the previous
                  previous = new_end;
              }
              return head;
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
      }
  }
