package Custom_stack_queue;

public class Custom_Queue<T> {
    protected Object[] arr;
    public int size;
    public int indexAtEnd = 0;

    public Custom_Queue() {
        this(5);
    }

    public Custom_Queue(int size) {
        this.size = size;
        arr = new Object[size];
    }

    // adding part
    public void add(T data)  {
        if (indexAtEnd == size-1) {
         sizeINcrease();
        }
        arr[indexAtEnd++] = data;

    }

    private void sizeINcrease() {
        int newSize = size * 2;
        Object[] temp = new Object[newSize];
        for (int i = 0; i < size; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
        this.size = newSize;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
//            if (arr[i] == null) {
//                break;
//            }
            System.out.print(arr[i] + " <- ");
        }
        System.out.println("finish");
    }


    public void delete() {
        for (int i = 1; i < size; i++) {
            arr[i-1] = arr[i];
        }
        size--;
    }

    public static void main(String[] args) {
        Custom_Queue<Integer> queue = new Custom_Queue<>();
        queue.add(11);
        queue.add(22);
        queue.add(33);
        queue.add(44);
        queue.add(55);
        queue.add(66);
        queue.add(77);
        queue.add(88);

        queue.delete();
        System.out.println(queue.size);
        
        queue.display();
    }
}
