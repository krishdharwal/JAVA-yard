package Custom_Linked_List;

public class Circular_linkedList {
    private Node head;
    private Node tail;
    public int size;
   public Circular_linkedList(){
        this.size = 1;
    }


                           //adding part
    public void addF(int data){
       Node node  = new Node(data);
       if (head == null){
           tail = node;
           head = node;
           return;
       }

       tail.next = node;
       node.next = head;
       tail = node;
       size++;
    }

    public void add(int data){
       Node node = new Node(data);
       tail.next = node;
        node.next = head;
       tail = node;
       size++;
    }

    public  void addMid(int idx,int data){

       Node temp = head;
        for (int i = 1; i < idx; i++) {
            temp = temp.next;
        }
        Node node = new Node(data);
        node.next = temp.next;
        temp.next = node;
        size++;
    }

        public void deleteAny(int idx){
       if (idx == 0){
           deleteFirst();
           return;
       }
       if(idx == size-1){
           deleteLast();
           return;
       }
       Node temp = head;
            for (int i = 1; i < idx; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            size--;
        }


                                   // deleting part

    public void deleteFirst(){
       tail.next = head.next;
       head = tail.next;
    }

       public void deleteLast(){
       Node temp = head;
           for (int i = 1; i < size; i++) {
               temp = temp.next;
           }
           tail.next = temp;
           temp.next = head;
       }



                              // display
    public void diaplay(){
       Node temp = head;
       while (temp.next != head){
           System.out.print(temp.data + " -> ");
           temp = temp.next;
       }
        System.out.println(temp.data);
    }


    private class Node{
        private int data;
        private Node next;

        public Node(int data){
            this.data = data;
        }
    }


    public static void main(String[] args) {
        Circular_linkedList list  = new Circular_linkedList();
        list.addF(11);
        list.addF(23);
        list.add(33);
        list.add(5);
        list.addMid(1,9);
        list.diaplay();
        System.out.println(list.size);

        System.out.println();

        list.deleteAny(3);
        list.diaplay();
        System.out.println(list.size);
    }
}