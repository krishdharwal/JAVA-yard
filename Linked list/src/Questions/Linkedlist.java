package Questions;



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
        node.address = head;
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
            System.out.print(temp.data + " ->");
            // this address refrence is pointing to the next node
            temp = temp.address;
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
        tail.address = node;
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
            temp = temp.address;
            idx--;
        }
        System.out.println(temp.data);
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
            temp = temp.address;
        }
        ListNode node = new ListNode(val, temp.address);
        temp.address = node;
        size++;
    }

    // deleting part's
    public void deleteStart() {
        head = head.address;
        size--;
    }

    public void deleteEnd() {
        ListNode temp = head;
        // by this i am able to delete as many elements from the last
        for (int i = 1; i < size; i++) {
            temp = temp.address;
        }
        temp.address = null;
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
            temp = temp.address;
        }
        ListNode prev = temp;
        prev.address = temp.address.address;
        size--;
    }

    // node class

    public class ListNode {
        public int data;
        public ListNode address;

        public ListNode() {

        }

        public ListNode(ListNode address) {
            this.address = address;
        }

        public ListNode(int val) {
            this.data = val;
        }

        public ListNode(int val, ListNode address) {
            this.data = val;
            this.address = address;
        }
    }

    // merging two sorted linked list

    public static void mergeInSort(Linkedlist first, Linkedlist second) {
        ListNode f = first.head;
        ListNode s = second.head;

        Linkedlist joined = new Linkedlist();

        while (f != null && s != null) {
            if (f.data < s.data) {
                joined.add(f.data);
                f = f.address;
            } else {
                joined.add(s.data);
                s = s.address;
            }
        }

        // if some left over
        while (f != null) {
            joined.add(f.data);
            f = f.address;
        }
        while (s != null) {
            joined.add(s.data);
            s = s.address;
        }

        joined.display();
    }

    public boolean CyclePresentOrNot() {
        ListNode slowPointer = head;
        ListNode fastPointer = head;

        while (fastPointer != null && fastPointer.address != null) {
            slowPointer = slowPointer.address;
            fastPointer = fastPointer.address.address;

            if (slowPointer == fastPointer) {
                return true;
            }
        }
        return false;
    }

    public void MakeCycle(int data) {
        ListNode temp = head;

        ListNode node = new ListNode(data);
        tail.address = node;
        tail = node;

        for (int i = 0; i < size / 2; i++) {
            temp = temp.address;
        }
        node.address = temp;

        size++;
    }

    public void cycleLength() {
        ListNode slow = head;
        ListNode fast = head;
        int count = 0;

        while (fast != null && fast.address != null) {
            slow = slow.address;
            fast = fast.address.address;

            if (slow == fast) {
                count = 1;
                slow = slow.address;

                while (slow != fast) {
                    slow = slow.address;
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

        while (fast != null && fast.address != null) {
            count++;
            slow = slow.address;
            fast = fast.address.address;
        }
        if (fast == null || fast.address == null) {
            System.out.println("the middle is -> " + slow.data);
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

            if (first.data > second.data) {
                // at start
                if (first == head) {
                    first.address = second.address;
                    second.address = first;
                    head = second;
                }
                // at end
                else if (second == tail) {
                    previous.address = second;
                    second.address = first;
                    first.address = null;
                    tail = first;
                }
                // at mid
                else {
                    previous.address = second;
                    first.address = second.address;
                    second.address = first;
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
            temp = temp.address;
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
        Reverse(node.address);
        tail.address = node;
        node.address = null;
        tail = node;
    }

    public void InPlaceReverse() {
        // NPE (nullPointerException)
        if (size < 2) {
            return;
        }
        ListNode previous = null;
        ListNode current = head;
        ListNode next = current.address;

        while (current != null) {
            current.address = previous;
            previous = current;
            current = next;
            if (next != null) {
                next = next.address;
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
            current = current.address;
        }
        ListNode last_pointer_from_start = previous;
        ListNode left_Start = current;

        ListNode next = current.address;

        for (int i = 0; i < right - left + 1 && current != null; i++) {
            current.address = previous;
            previous = current;
            current = next;
            if (next != null) {
                next = next.address;
            }
        }
        if (last_pointer_from_start == null) {
            head = previous;
        } else {
            last_pointer_from_start.address = previous;
        }
        if (current != null) {
            left_Start.address = current;
        } else {
            left_Start.address = null;
        }
    }


    public ListNode reverseBetween( int left, int right) {

        ListNode prev = null;
        ListNode node = head;

        for (int i = 0; i < left - 1; i++) {
            prev = node;
            node = node.address;
        }
        // reverse it````````
        ListNode start_conn = prev;
        ListNode end_conn = node;

        ListNode temp = node.address;
        for (int i = 0; i < right - left + 1; i++) {

            node.address = prev;
            prev = node;
            node = temp;
            if (temp != null) temp = temp.address;
        }

        if (start_conn != null) {
            start_conn.address = prev;
        }else {
            head = prev;
        }

        if (node != null) {
            end_conn.address = node;
        }else {
            end_conn.address = null;
        }

        return head;
    }


    public ListNode ReverseMid() {
        ListNode previous = null;
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.address != null) {
            previous = slow;
            slow = slow.address;
            fast = fast.address.address;
        }
        ListNode last = ReverseForMid_Helper(slow);
        previous.address = last;

        return last;
    }

    private ListNode ReverseForMid_Helper(ListNode slow) {
        ListNode prev = null;
        ListNode current = slow;
        ListNode next = slow.address;

        while (current != null) {
            current.address = prev;
            prev = current;
            current = next;
            if (next != null) {
                next = next.address;
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
            mid = mid.address;
        }

        int p = 0;
        while (p != mid_idx) {
            if (first.data == mid.data) {
                first = first.address;
                mid = mid.address;
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
            ListNode temp = Head_first.address;
            Head_first.address = Head_second;
            Head_first = temp;

            temp = Head_second.address;
            Head_second.address = Head_first;
            Head_second = temp;
        }
        if (Head_first != null) {
            Head_first.address = null;
        }
    }

    // Helper method to find the middle of the linked list
    private ListNode findMiddle2() {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.address != null) {
            slow = slow.address;
            fast = fast.address.address;
        }
        return slow; // This is the middle node
    }

    // Helper method to reverse the second half of the linked list
    private ListNode ReverseMid2(ListNode middle) {
        ListNode prev = null;
        ListNode current = middle;
        while (current != null) {
            ListNode next = current.address; // Store next node
            current.address = prev; // Reverse the link
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
            ListNode next = current.address;


            for (int i = 0; i < k && current != null; i++) {
                current.address = previous;
                previous = current;
                current = next;
                if (next != null){
                    next = next.address;
                }
            }

            if (last_connector != null) {
                last_connector.address = previous;
            }
            else { // means that there is no last end connector
                head = previous;
            }
            new_end.address = current;

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
            ListNode next = currrent.address;

            for (int i = 0; i < k && currrent != null; i++) {
                currrent.address = previous;
                previous = currrent;
                currrent = next;

                if (next != null){
                    next = next.address;
                }
            }
            if (last_pointer != null) {
                last_pointer.address = previous;
            }
            else {
                head = previous;
            }
            new_end.address = currrent;

            for (int i = 0; i < k && currrent != null; i++) {
                previous = currrent;
                currrent = next;
                if (next != null) {
                    next = next.address;
                }

            }
        }
    }

    // rotate the list K times
    public void Rotate(int k) {
        if (k == 0){
            return;
        }

        for (int i = 0; i < k; i++) {

            ListNode previous = null;
            ListNode temp = head;

            while (temp.address != null) {
                previous = temp;
                temp = temp.address;
            }
            temp.address = head;
            head = temp;
            previous.address = null;

        }
        }

//        public ListNode rotateRight(ListNode head, int k) {
//            if (k == 0 || head == null || head.next == null ){
//                return head;
//            }
//
//
//            ListNode previous = null;
//            ListNode temp = head;
//
//            while (temp.next != null) {
//                previous = temp;
//                temp = temp.next;
//            }
//            temp.next = head;
//            head = temp;
//            previous.next = null;
//
//            return rotateRight(head,k-1);
//        }

    }





