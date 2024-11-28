package Questions;

public class FindMiddle extends Linkedlist{


    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        list.findMiddle();
    }


//    @Override
//    public Node findMiddle(){
//       Node slow = head;
//        Node fast = head;
//
//        while (fast != null && fast.address != null){
//            slow = slow.address;
//            fast = fast.address.address;
//        }
//        if (fast == null || fast.address == null) {
//            System.out.println("the middle is -> " + slow.data);
//        }
//        return slow;
//    }
}
