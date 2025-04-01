    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode temp = head;
        ListNode evenStart = head.next;
        ListNode l2 = evenStart;

        while(temp != null && temp.next != null && l2 != null && l2.next != null){
            temp.next = l2.next;
            temp = temp.next;
            l2.next = temp.next;
            l2 = l2.next;
        }
        temp.next = evenStart;
        return head;
    }
