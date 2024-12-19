package Questions;

public class Merge_In_sorted_order {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    class Solution {
        public ListNode mergeKLists(ListNode[] lists){
            if (lists == null || lists.length == 0){
                return null;
            }

            int length = lists.length;
            ListNode header = new ListNode(-1); // Dummy node for simplicity
            ListNode mainLL = header;

            while (true) {
                int minIndex = -1;
                int minValue = Integer.MAX_VALUE;

                // Find the list with the smallest current value
                for (int i = 0; i < length; i++) {
                    if (lists[i] != null && lists[i].val < minValue) {
                        minValue = lists[i].val;
                        minIndex = i;
                    }
                }

                if (minIndex == -1) {
                    break; // All lists are processed
                }

                // Add the smallest node to the merged list
                mainLL.next = lists[minIndex];
                mainLL = mainLL.next;

                // Move the pointer forward in the list with the smallest node
                lists[minIndex] = lists[minIndex].next;
            }

            return header.next;
        }
    }

}
