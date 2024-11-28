package Questions;

public class Reorder_BY_K {
    public static void main(String[] args) {
        Linkedlist list  = new Linkedlist();
        for (int i = 1; i < 6; i++) {
            list.add(i);
        }
        list.display();
        list.Reorder_by_K(2);
        list.display();
    }
}
