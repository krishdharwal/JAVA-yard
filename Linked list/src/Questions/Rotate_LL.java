package Questions;

public class Rotate_LL {

    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();
        for (int i = 1; i <= 5; i++) {
            list.add(i);
        }

        list.display();
        list.Rotate(1);
        list.display();
    }
}
