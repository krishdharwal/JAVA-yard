package Questions;

public class ReverseLL {
    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();

        for (int i = 1; i <= 5; i++) {
            list.add(i);
        }

        list.display();
//        list.Reverse();
        list.InPlaceReverse();
        list.display();
    }
}
