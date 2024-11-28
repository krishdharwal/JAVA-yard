package Questions;

public class Reverse_Between {
    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();
//        for (int i = 1; i <= 5; i++) {
//            list.add(i);
//        }
        list.add(3);
        list.add(5);
//        list.add(4);
        list.display();
        System.out.println();

        list.reverseBetween(1,2);
//        list.Reverse_Between(1,2);
        list.display();
    }
}
