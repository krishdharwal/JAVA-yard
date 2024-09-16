package Custom_stack_queue;

public class Circular_Queue<T> {
    protected Object[] arr;
    protected int size;
    // two pointers front and end
    private int front = 0;
    private int end = 0;

    public Circular_Queue(int size) {
        arr = new Object[size];
    }

    public void add(T data) {
        if (size == arr.length) {
            System.out.println("cant add more");
            return;
        }
        arr[end++] = data;
        end = end % arr.length;
        size++;
    }

    public void display() {
        if (size == 0) {
            System.out.println("nope ");
            return;
        }
        int i = front;
        do {
            System.out.print(arr[i] + " <- ");
            i++;
            i = i % arr.length;
        } while (i != end);
        System.out.println("END");
    }


    public void delete() {
        if (size == 0) {
            System.out.println("underflow");
            return;
        }
        // delete at front
        front++;
        front = front % arr.length;
        size--;
    }


    public static void main(String[] args) {
        Circular_Queue<Integer> queue = new Circular_Queue<>(5);
        queue.add(8);
        queue.add(12);
        queue.add(213);
        queue.add(3);
        queue.add(0);
        queue.delete();
        queue.add(6);
        queue.display();

        queue.delete();
        queue.display();


        queue.delete();
        queue.display();

        queue.add(777);
        queue.display();

    }
}