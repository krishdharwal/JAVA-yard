package Questions;

// in this we reverse linked list specific part
// or from specific index to index

public class ReverseLLPart {
    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();
        for (int i = 1; i <= 5; i++) {
            list.add(i);
        }

        list.display();


        list.ReverseMid();
        list.display();

    }
}
