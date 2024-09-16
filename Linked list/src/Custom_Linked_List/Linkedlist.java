package Custom_Linked_List;

public class Linkedlist {
    private Node head;
    private Node tail;
    public int size;

   public Linkedlist(){
       this.size = 0;
    }

    // 1.  this constructor will add value always in first position
    public void addATfirst(int val){
        Node node  = new Node(val);
        // this is assigning the address to head
        node.address = head;
        // now in this head will point to first node
        head = node;
        // in this if first element is being added means there is no tail so assign tail to first node
        if (tail == null){
            tail = head;
        }
        size++;
    }

    // 2.  displaying whole thing
    public void display(){
       Node temp = head;
       while (temp != null){
           System.out.print(temp.val + " ->");
           // this address refrence is pointing to the next node
           temp = temp.address;
       }
        System.out.println("END");
    }

    // 3. simple flow add / add in last
    public void add(int val){
       if (tail == null){
           addATfirst(val);
           return;
       }
       Node node = new Node(val);
       // in this the tail's (previous node address) now will point to new node
       tail.address = node;
       // this will reassing the tail to new node
        // and after the method will over the node will remain int the scope of this function
        // and only remain is tail's new address
       tail  =  node;
       size++;
    }

    // for getting the specific index value
    public void access(int idx){
        Node temp = head;
        while (idx != 0){
            temp = temp.address;
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

       Node temp = head;
        for (int i = 0; i < idx; i++) {
            temp = temp.address;
        }
       Node node = new Node(val,temp.address);
       temp.address = node;
       size++;
    }

             // deleting part's
    public void deleteStart(){
       head = head.address;
       size--;
    }

    public void deleteEnd(){
       Node temp = head;
       // by this i am able to delete as many elements from the last
        for (int i = 1; i < size; i++) {
            temp = temp.address;
        }
        temp.address = null;
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


        Node temp = head;
        for (int i = 1; i < idx; i++) {
            temp = temp.address;
        }
         Node prev = temp;
        prev.address  = temp.address.address;
        size--;
    }


                                    // node class
    private class Node {
        private int val;
        private Node address;

    public Node(){

    }


      public Node(Node address){
        this.address = address;
      }
      public Node(int val){
            this.val = val;
        }

    public Node(int val, Node address) {
        this.val = val;
        this.address = address;
    }
}
}


class callLL{
    public static void main(String[] args) {
        Linkedlist list1 = new Linkedlist();
        list1.add(11);
        list1.add(123);
        list1.add(99);
        list1.add(22);
        list1.add(8);
//        list1.deleteStart();
//        list1.addMid(1,7);
        list1.addMid(3,7);
//        list1.addMid(1,7);



        list1.display();
        System.out.println();
////        list1.deleteEnd(4);
//        list1.deleteAnywher(0);
//        list1.deleteAnywher(1);
//        list1.deleteAnywher(2);
//        list1.deleteAnywher(3);
//        list1.deleteAnywher(4 );
        list1.display();

//        System.out.println(list1.size);
//        list1.access(2);
    }
}