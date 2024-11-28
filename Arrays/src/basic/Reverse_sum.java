//package basic;
//
//public class Reverse_sum {
//
//
//     public class ListNode {
//         int val;
//         ListNode next;
//         ListNode() {}
//         ListNode(int val) { this.val = val; }
//         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//     }
//
//    class Solution {
//        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//            return l1;
//        }
//
//        public  ListNode reverseLL(ListNode head){
//            ListNode node = head;
//            ListNode temp = node.next;
//            ListNode prev = null;
//
//            while (node != null && node.next != null){
//
//                node.next = prev;
//                prev = node;
//                node = temp;
//                temp = temp.next;
//
//            }
//            head = node;
//            return head;
//        }
//    }
//
//}
