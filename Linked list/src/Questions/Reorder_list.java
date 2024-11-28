package Questions;

public class Reorder_list {

    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();
        for (int i = 1; i <= 5; i++) {
            list.add(i);
        }

        list.display();
        list.ReOrder();
        list.display();
    }
}
