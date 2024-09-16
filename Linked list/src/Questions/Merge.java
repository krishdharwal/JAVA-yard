package Questions;

public class Merge extends Linkedlist{

    public static void main(String[] args) {
        Linkedlist first = new Linkedlist();
        first.add(1);
        first.add(2);
        first.add(3);
//        first.display();


        Linkedlist second = new Linkedlist();
        second.add(1);
        second.add(4);
        second.add(5);
        second.add(6);
        second.add(3);
        second.add(4);
        second.add(8);
        second.MakeCycle(43);
//        second.display();


//        mergeInSort(first,second);
//       boolean ans = second.CyclePresentOrNot();
//        System.out.println(ans);

        second.cycleLength();
    }


//       --------- merging two sorted linked list --------
//
//    public static void mergeInSort(Linkedlist first, Linkedlist second) {
//        Node f = first.head;
//        Node s = second.head;
//
//        Linkedlist joined = new Linkedlist();
//
//        while (f != null && s != null){
//            if (f.val < s.val){
//                joined.add(f.val);
//                f = f.address;
//            }
//            else {
//                joined.add(s.val);
//                s = s.address;
//            }
//        }
//
//        // if some left over
//        while (f != null){
//            joined.add(f.val);
//            f = f.address;
//        }
//        while (s != null){
//            joined.add(s.val);
//            s = s.address;
//        }
//
//        joined.display();
//    }
//


}
