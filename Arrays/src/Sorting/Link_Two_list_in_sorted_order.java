package Sorting;

public class Link_Two_list_in_sorted_order {


     class ListNode {
         int val;
         ListNode next;

         ListNode() {
         }

         ListNode(int val) {
             this.val = val;
         }

         ListNode(int val, ListNode next) {
             this.val = val;
             this.next = next;
         }
     }


        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
         ListNode head = new ListNode();
         ListNode tail = head;

         while (list1.next != null && list2.next != null){
             if (list1.val < list2.val){
                 tail.next = list1;
                 list1 = list1.next;
             }else {
                 tail.next = list2;
                 list2 = list2.next;
             }
             tail = tail.next;
         }

         tail.next = (list1 == null) ? list2 : list1 ;

            return head.next;
        }



    }


