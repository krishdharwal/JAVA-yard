package Questions;


import java.util.List;

public class Linkedlist {

    public ListNode head;
    private ListNode tail;
    public int size;

    public int giveSize() {
        return size;
    }

    public Linkedlist() {
        this.size = 0;
    }

    // 1.  this constructor will add value always in first position
    public void addATfirst(int val) {
        ListNode node = new ListNode(val);
        // this is assigning the address to head
        node.next = head;
        // now in this head will point to first node
        head = node;
        // in this if first element is being added means there is no tail so assign tail to first node
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    // 2.  displaying whole thing
    public void display() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ->");
            // this address refrence is pointing to the next node
            temp = temp.next;
        }
        System.out.println("END");
    }

    // 3. simple flow add / add in last
    public void add(int val) {
        if (tail == null) {
            addATfirst(val);
            return;
        }
        ListNode node = new ListNode(val);
        // in this the tail's (previous node address) now will point to new node
        tail.next = node;
        // this will reassing the tail to new node
        // and after the method will over the node will remain int the scope of this function
        // and only remain is tail's new address
        tail = node;
        size++;
    }

    // for getting the specific index value
    public void access(int idx) {
        ListNode temp = head;
        while (idx != 0) {
            temp = temp.next;
            idx--;
        }
        System.out.println(temp.val);
    }

    public void addMid(int idx, int val) {
        if (idx == 0) {
            addATfirst(val);
            return;
        }
        if (idx == size - 1) {
            add(val);
            return;
        }

        ListNode temp = head;
        for (int i = 0; i < idx; i++) {
            temp = temp.next;
        }
        ListNode node = new ListNode(val, temp.next);
        temp.next = node;
        size++;
    }

    // deleting part's
    public void deleteStart() {
        head = head.next;
        size--;
    }

    public void deleteEnd() {
        ListNode temp = head;
        // by this i am able to delete as many elements from the last
        for (int i = 1; i < size; i++) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        size--;
    }

    public void deleteAnywher(int idx) {
        if (idx == 0) {
            deleteStart();
        }
        if (idx == size - 1) {
            deleteEnd();
        }
        if (idx == size - 2) {
            deleteEnd();
        }


        ListNode temp = head;
        for (int i = 1; i < idx; i++) {
            temp = temp.next;
        }
        ListNode prev = temp;
        prev.next = temp.next.next;
        size--;
    }

    // node class

    public class ListNode {
        public int val;
        public ListNode next;

        public ListNode() {

        }

        public ListNode(ListNode address) {
            this.next = address;
        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode address) {
            this.val = val;
            this.next = address;
        }
    }

    // merging two sorted linked list

    public static void mergeInSort(Linkedlist first, Linkedlist second) {
        ListNode f = first.head;
        ListNode s = second.head;

        Linkedlist joined = new Linkedlist();

        while (f != null && s != null) {
            if (f.val < s.val) {
                joined.add(f.val);
                f = f.next;
            } else {
                joined.add(s.val);
                s = s.next;
            }
        }

        // if some left over
        while (f != null) {
            joined.add(f.val);
            f = f.next;
        }
        while (s != null) {
            joined.add(s.val);
            s = s.next;
        }

        joined.display();
    }

    public boolean CyclePresentOrNot() {
        ListNode slowPointer = head;
        ListNode fastPointer = head;

        while (fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;

            if (slowPointer == fastPointer) {
                return true;
            }
        }
        return false;
    }

    public void MakeCycle(int data) {
        ListNode temp = head;

        ListNode node = new ListNode(data);
        tail.next = node;
        tail = node;

        for (int i = 0; i < size / 2; i++) {
            temp = temp.next;
        }
        node.next = temp;

        size++;
    }

    public void cycleLength() {
        ListNode slow = head;
        ListNode fast = head;
        int count = 0;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                count = 1;
                slow = slow.next;

                while (slow != fast) {
                    slow = slow.next;
                    count++;
                }
                break;
            }

        }
        System.out.println(count);
        System.out.println(giveSize() - count + " this is the element where cycle starts");
    }

    public int findMiddle() {
        int count = 0;
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            count++;
            slow = slow.next;
            fast = fast.next.next;
        }
        if (fast == null || fast.next == null) {
            System.out.println("the middle is -> " + slow.val);
        }
        return count;
    }

    // sorting
    public void BubbleSort() {
        BubbleSort(size - 1, 0);
    }

    public void BubbleSort(int row, int col) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            ListNode first = get(col);
            ListNode second = get(col + 1);
            ListNode previous = get(col - 1);

            if (first.val > second.val) {
                // at start
                if (first == head) {
                    first.next = second.next;
                    second.next = first;
                    head = second;
                }
                // at end
                else if (second == tail) {
                    previous.next = second;
                    second.next = first;
                    first.next = null;
                    tail = first;
                }
                // at mid
                else {
                    previous.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }
            BubbleSort(row, col + 1);
        } else {
            BubbleSort(row - 1, 0);
        }
    }

    public ListNode get(int i) {
        ListNode temp = head;
        for (int j = 0; j < i; j++) {
            temp = temp.next;
        }
        return temp;
    }

    // reverse a linked list
    public void Reverse() {
        Reverse(head);
    }

    public void Reverse(ListNode node) {
        if (node == tail) {
            head = node;
            return;
        }
        Reverse(node.next);
        tail.next = node;
        node.next = null;
        tail = node;
    }

    public void InPlaceReverse() {
        // NPE (nullPointerException)
        if (size < 2) {
            return;
        }
        ListNode previous = null;
        ListNode current = head;
        ListNode next = current.next;

        while (current != null) {
            current.next = previous;
            previous = current;
            current = next;
            if (next != null) {
                next = next.next;
            }
        }
//        head = previous;
    }
    // reverse between

    public void Reverse_Between(int left, int right) {
        if (left == right) {
            return;
        }

        ListNode previous = null;
        ListNode current = head;

        for (int i = 0; i < left - 1 && current != null; i++) {
            previous = current;
            current = current.next;
        }
        ListNode last_pointer_from_start = previous;
        ListNode left_Start = current;

        ListNode next = current.next;

        for (int i = 0; i < right - left + 1 && current != null; i++) {
            current.next = previous;
            previous = current;
            current = next;
            if (next != null) {
                next = next.next;
            }
        }
        if (last_pointer_from_start == null) {
            head = previous;
        } else {
            last_pointer_from_start.next = previous;
        }
        if (current != null) {
            left_Start.next = current;
        } else {
            left_Start.next = null;
        }
    }


    public ListNode reverseBetween( int left, int right) {

        ListNode prev = null;
        ListNode node = head;

        for (int i = 0; i < left - 1; i++) {
            prev = node;
            node = node.next;
        }
        // reverse it````````
        ListNode start_conn = prev;
        ListNode end_conn = node;

        ListNode temp = node.next;
        for (int i = 0; i < right - left + 1; i++) {

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


    public ListNode ReverseMid() {
        ListNode previous = null;
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            previous = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode last = ReverseForMid_Helper(slow);
        previous.next = last;

        return last;
    }

    private ListNode ReverseForMid_Helper(ListNode slow) {
        ListNode prev = null;
        ListNode current = slow;
        ListNode next = slow.next;

        while (current != null) {
            current.next = prev;
            prev = current;
            current = next;
            if (next != null) {
                next = next.next;
            }
        }
        return prev;
    }
    // palindrome linked list

    public boolean isPalindromeLL() {
        ReverseMid();
        int mid_idx = giveSize() / 2;

        ListNode first = head;
        ListNode mid = head;

        for (int i = 0; i < mid_idx; i++) {
            mid = mid.next;
        }

        int p = 0;
        while (p != mid_idx) {
            if (first.val == mid.val) {
                first = first.next;
                mid = mid.next;
                p++;
            } else {
                return false;
            }
        }
        return true;
    }

    // reverse from middle and take two pointer and reorder them

    public void ReOrder() {
        ListNode mid = findMiddle2();

        ListNode Head_first = head;
        ListNode Head_second = ReverseMid2(mid);
        while (Head_first != null && Head_second != null) {
            ListNode temp = Head_first.next;
            Head_first.next = Head_second;
            Head_first = temp;

            temp = Head_second.next;
            Head_second.next = Head_first;
            Head_second = temp;
        }
        if (Head_first != null) {
            Head_first.next = null;
        }
    }

    // Helper method to find the middle of the linked list
    private ListNode findMiddle2() {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // This is the middle node
    }

    // Helper method to reverse the second half of the linked list
    private ListNode ReverseMid2(ListNode middle) {
        ListNode prev = null;
        ListNode current = middle;
        while (current != null) {
            ListNode next = current.next; // Store next node
            current.next = prev; // Reverse the link
            prev = current; // Move prev to current
            current = next; // Move to next node
        }
        return prev; // New head of the reversed list
    }

    // reOrder by K elements

    public void Reorder_by_K(int k) {
        if (k <= 1 && head == null) {
            return;
        }
        ListNode previous = null;
        ListNode current = head;

        while(current != null){
            ListNode last_connector = previous;
            ListNode new_end  = current;
            ListNode next = current.next;


            for (int i = 0; i < k && current != null; i++) {
                current.next = previous;
                previous = current;
                current = next;
                if (next != null){
                    next = next.next;
                }
            }

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
    }

    public void Reorder_by_K_Skip(int k) {
        if (k <= 1 && head == null){
            return;
        }

        ListNode previous = null;
        ListNode currrent = head;

        while (currrent != null){
            ListNode last_pointer = previous ;
            ListNode new_end = currrent;
            ListNode next = currrent.next;

            for (int i = 0; i < k && currrent != null; i++) {
                currrent.next = previous;
                previous = currrent;
                currrent = next;

                if (next != null){
                    next = next.next;
                }
            }
            if (last_pointer != null) {
                last_pointer.next = previous;
            }
            else {
                head = previous;
            }
            new_end.next = currrent;

            for (int i = 0; i < k && currrent != null; i++) {
                previous = currrent;
                currrent = next;
                if (next != null) {
                    next = next.next;
                }

            }
        }
    }

    public static void main(String[] args) {
        Linkedlist linkedlist_1 = new Linkedlist();
        linkedlist_1.add(1);
        linkedlist_1.add(4);
        linkedlist_1.add(5);
        linkedlist_1.add(7);
        linkedlist_1.add(9);

        linkedlist_1.display();

        ReorderList reorderList = new ReorderList();
       ListNode ans =  reorderList.findMiddle(linkedlist_1.head);
        System.out.println(ans.val);

        reorderList.reverse(linkedlist_1.head);

    }

    public ListNode RotateLL(){
        if(head == null || head.next == null){
            return head;
        }

        ListNode prev = null;
        ListNode curr = head;
        ListNode fwd = curr.next;

        while (curr != null){
            curr.next = prev;
            prev = curr;
            curr = fwd;
            if (fwd != null ) fwd = fwd.next;
        }
        head = prev;
        return prev;
    }


    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length <= 0){
            return null;
        }
        int i = 0;
        while(lists[i] == null && lists.length <=1){
            return null;
        }
        int length = lists.length;
        // "i" will traverse to all linked list starting node in array

        ListNode header = lists[i];
        int k = i;
        if (i < length-1) {
             k = i + 1;
        }
        // temp will point to first linked list
        while(header == null){
            header = lists[k];
            k++;
        }
        ListNode mainLL = header;

        while (k < length){

            ListNode secLL = lists[k];
            while (secLL != null){
                if (mainLL.next != null && secLL.val > mainLL.next.val){
                    mainLL = mainLL.next;
                }else {
                    // make next pointer reference
                    ListNode fwdOfSec = null;
                    if (secLL.next != null) {
                        fwdOfSec = secLL.next;
                    }
                    secLL.next =  mainLL.next;
                    mainLL.next = secLL;
                    // increment it
//                    mainLL = secLL;
                    secLL = fwdOfSec;
                }
            }
            k++;
            mainLL = header;
        }
        return header;
    }


}

