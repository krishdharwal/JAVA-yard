package Questions;

public class Reverse_Between {
    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();
        for (int i = 1; i <= 5; i++) {
            list.add(i);
        }
        list.display();
        System.out.println();

        list.Reverse_Between(2,4);
        list.display();
    }
}
