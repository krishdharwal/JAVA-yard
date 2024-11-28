package Custom_Linked_List;

public class linked_list {
    private Node head;
    private Node tail;
    private int size;

    public linked_list() {
        this.size = 0;
    }

    //adding
    public void addFirst(int ele){
        Node node = new Node(ele);
        // in this the head is pointing to the first node and
        // that's why we are pointing the new node address to head ( means both are pointing to same node)
        // then just reassing the head pointing to new node
        node.NextAddress = head;
        head = node;
        if (tail == null){
            tail = head;
        }
        size++;
    }

    public void addEnd(int ele){
        Node node = new Node(ele);
        // isme hora hai ki mera jo last element hai jo ki hai ,tail hi ek tara se
        // toh vo kara hai point mere naye node ko
        // or fir jo tail hai usko point kar denge naye node ko
        tail.NextAddress = node;
        tail = node;
        size++;
    }

    public void addAnywhere(int idx,int ele){
        if (idx == 0) {
            addFirst(ele);
            return;
        }
        if (idx == size){
            addEnd(ele);
            return;
        }
        Node node = new Node(ele);
        Node temp = head;
        for (int i = 1; i < idx; i++) {
            temp = temp.NextAddress;
        }
        node.NextAddress = temp.NextAddress;
        temp.NextAddress = node;
        size++;
    }

    public void display(){
        Node temp = head;
        System.out.print("HEAD -> ");
        while (temp != null){

            System.out.print(temp.data + " -> ");
            temp = temp.NextAddress;
        }
        System.out.println("TAIL");;
    }

    public void size(){
        System.out.println();
        System.out.println(size);
    }


                                        // deleting part
    public void deleteFirst(){
        head = head.NextAddress;
        size--;
    }

    public void deleteLast(){
        Node temp = head;
        for (int i = 0; i < size-2; i++) {
            temp = temp.NextAddress;
        }
        tail = temp;
        temp.NextAddress = null;
        size--;
           }
           public void deleteAnywher(int idx){
        if (idx == 0){
            deleteFirst();
            return;
        }

        if (idx == size-1){
            deleteLast();
            return;
        }

        Node temp = head;
               for (int i = 1; i < idx; i++) {
                   temp = temp.NextAddress;

               }
               temp.NextAddress = temp.NextAddress.NextAddress;
               size--;
           }

           public void access(int idx){
        Node temp = head;
               for (int i = 0; i < idx; i++) {
                   temp = temp.NextAddress;
               }
               System.out.println( "At given index ( " + idx + " ) the value is -> " + temp.data);
           }

           public void GetVALUElocation(int val){
        Node temp = head;
               int location = 0;
               for (int i = 0; i < size; i++) {
                   if (temp.data == val){
                       System.out.println("found at location -> " + location);
                   }
                   temp = temp.NextAddress;
                   location++;
               }
           }





    public void add_without_tail(int data) {
        if (head == null){
            Node nodee  = new Node(data);
            head = nodee;
            return;
        }
        add_without_tail(head, data);
    }

    public Node add_without_tail(Node node, int data) {
        if (node == null){
            Node New_node = new Node(data);
            return New_node;
        }

        node.NextAddress = add_without_tail(node.NextAddress,data);

        return node;
    }
    private class Node{
        private int data;
        private Node NextAddress;

        public Node() {
        }

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node nextAddress) {
            this.data = data;
            NextAddress = nextAddress;
        }
    }

    public static void main(String[] args) {

        // adding
        linked_list list = new linked_list();
//        list.addFirst(11);
//        list.addEnd(22);
//        list.addEnd(9);
//        list.addEnd(8);
//        list.addAnywhere(4, 5);
        list.add_without_tail(10);
        list.add_without_tail(12);
        list.add_without_tail(13);
        list.add_without_tail(14);
        list.display();

//        list.size();


        // deleteing
//        list.deleteFirst();
//        list.deleteLast();
//        list.deleteAnywher(2);
//        list.display();
//        list.size();

//        list.GetVALUElocation(5);
//        list.access(2);


    }

}