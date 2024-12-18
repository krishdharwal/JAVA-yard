package Custom_Linked_List;

public class Linkedlist {
    private ListNode head;
    private ListNode tail;
    public int size;

   public Linkedlist(){
       this.size = 0;
    }

    // 1.  this constructor will add value always in first position
    public void addATfirst(int val){
        ListNode listNode = new ListNode(val);
        // this is assigning the address to head
        listNode.next = head;
        // now in this head will point to first node
        head = listNode;
        // in this if first element is being added means there is no tail so assign tail to first node
        if (tail == null){
            tail = head;
        }
        size++;
    }

    // 2.  displaying whole thing
    public void display(){
       ListNode temp = head;
       while (temp != null){
           System.out.print(temp.val + " ->");
           // this address refrence is pointing to the next node
           temp = temp.next;
       }
        System.out.println("END");
    }

    // 3. simple flow add / add in last
    public void add(int val){
       if (tail == null){
           addATfirst(val);
           return;
       }
       ListNode listNode = new ListNode(val);
       // in this the tail's (previous node address) now will point to new node
       tail.next = listNode;
       // this will reassing the tail to new node
        // and after the method will over the node will remain int the scope of this function
        // and only remain is tail's new address
       tail  = listNode;
       size++;
    }

    // for getting the specific index value
    public void access(int idx){
        ListNode temp = head;
        while (idx != 0){
            temp = temp.next;
            idx--;
        }
        System.out.println(temp.val);
    }

    public void addMid(int idx,int val){
        if (idx == 0) {
            addATfirst(val);
            return;
        }
        if (idx == size-1){
            add(val);
            return;
        }

       ListNode temp = head;
        for (int i = 0; i < idx; i++) {
            temp = temp.next;
        }
       ListNode listNode = new ListNode(val,temp.next);
       temp.next = listNode;
       size++;
    }

             // deleting part's
    public void deleteStart(){
       head = head.next;
       size--;
    }

    public void deleteEnd(){
       ListNode temp = head;
       // by this i am able to delete as many elements from the last
        for (int i = 1; i < size; i++) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        size--;
    }

    public void deleteAnywher(int idx){
       if (idx == 0){
           deleteStart();
       }
       if (idx == size-1 ){
           deleteEnd();
       }
       if (idx == size-2){
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
    private class ListNode {
        private int val;
        private ListNode next;

    public ListNode(){

    }


      public ListNode(ListNode next){
        this.next = next;
      }
      public ListNode(int val){
            this.val = val;
        }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
    // reverse between
    public ListNode reverseBetween(int k){
        if (k <= 1 || k > 5){
            return head;
        }
        ListNode temp = head;
        ListNode connector = temp;
        while (k > 1){
            temp = temp.next;
            k--;
            if (k == 2) connector = temp;
        }

        ListNode prev = null;
        ListNode curr = temp;
        ListNode fwd = curr.next;

        while (curr != null ){
            curr.next = prev;
            prev = curr;
            curr = fwd;
            if (fwd != null) fwd = fwd.next;
        }
        connector.next = prev;
        return head;
    }


    public void reverseBetween_2(){

        ListNode prev = null;
        ListNode curr = head;
        ListNode fwd = curr.next;
        int i = 2;
        // do it two times
        while (curr != null && i != 0){
            curr.next = prev;
            prev = curr;
            curr = fwd;
            if (fwd != null) fwd = fwd.next;
            i--;
        }
        head = prev;
        prev.next = fwd;

    }

    public ListNode FindMid(){
    ListNode slow = head;
    ListNode fast = slow.next;

    while (fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
    }

    System.out.println(slow.val);
    return slow;
}

    public int findLengthOfLL(){
        ListNode temp = head;
        int count = 0;
        while (temp != null){
            count++;
            temp = temp.next;
        }
        System.out.println(count);
        return count;
    }

    public static void main(String[] args) {
       Linkedlist[] list = new Linkedlist[2];

        Linkedlist list1 = new Linkedlist();
        list1.add(1);
        list1.add(4);
        list1.add(5);


        Linkedlist list2 = new Linkedlist();
        list2.add(1);
        list2.add(3);
        list2.add(4);

        list[0] = list1;
        list[1] = list2;


    }


}