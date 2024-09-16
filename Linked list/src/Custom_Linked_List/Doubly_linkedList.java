package Custom_Linked_List;

public class Doubly_linkedList {
    private Node head;
    public int size;

    public Doubly_linkedList(){
        this.size = 0;
    }

                            // adding first element
    public void addFirst(int data){
        Node node = new Node(data);
        node.nextAddress = head;
        node.previousAdd = null;
        if (head != null) {
            head.previousAdd = node;
        }
        head = node;
        size++;
    }

                           // add anywhere
    public void add(int idx,int data){
        if (idx == 0){
            addFirst(data);
            return;
        }

        if (idx == size-2){
            addLast(data);
            return;
        }


        Node temp = head;
        for (int i = 1; i < idx; i++) {
            temp = temp.nextAddress;
        }

        Node node = new Node(data,temp.nextAddress,temp);

        // you can also do this ! (instead of upper part)
        //        node.previousAdd = temp;
        //        node.nextAddress = temp.nextAddress.nextAddress;

        temp.nextAddress.previousAdd = node;
        temp.nextAddress = node;
        size++;
    }

    public void addLast(int data) {
        Node node = new Node(data);
        Node temp = head;
        while (temp.nextAddress != null){
            temp = temp.nextAddress;
        }
        temp.nextAddress = node;
        node.previousAdd = temp;
        size++;
    }

    // display
    public void display(){
        Node temp = head;
        System.out.print("head -> ");
        while (temp != null){
            System.out.print(temp.data + " <-> ");
            temp = temp.nextAddress;
        }
        System.out.println("null");
    }


                                    // deleting part

    public void deleteFirst(){
        head = head.nextAddress;
        head.previousAdd = null;
        size--;
    }

    public void deleteLast(){
        Node temp  = head;
        while (temp.nextAddress.nextAddress != null){
            temp = temp.nextAddress;
        }
        temp.nextAddress = null;
    }

    public void deleteAnywhere(int idx){
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
            temp = temp.nextAddress;
        }
        temp.nextAddress = temp.nextAddress.nextAddress;
        temp.nextAddress.previousAdd = temp;
        size--;

    }
    private class Node{
        private int data;
        private Node nextAddress;
        private Node previousAdd;

        public Node(int data){
            this.data = data;
        }
        public Node(int data,Node nextAddress){
            this.data = data;
            this.nextAddress = nextAddress;
        }

        public Node(int data, Node nextAddress, Node previousAdd) {
            this.data = data;
            this.nextAddress = nextAddress;
            this.previousAdd = previousAdd;
        }
    }


    public static void main(String[] args) {
        Doubly_linkedList list = new Doubly_linkedList();
        list.addFirst(1);
        list.addFirst(0);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);
//        list.add(3,8);
//        list.add(6,10);
        list.display();


//        list.deleteFirst();
//
//        list.deleteLast();
//        list.deleteLast();

        list.deleteAnywhere(6);
        list.display();



        System.out.println();
        System.out.println(list.size);
    }
}