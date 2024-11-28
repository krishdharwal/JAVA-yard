package Custom_stack_queue;

public class Custom_Stack<T> {
    protected Object[] arr;
    public final static int Default_size = 10;
    public int size;
    public int index = -1;

    public Custom_Stack() {
        this(Default_size);
    }

    public Custom_Stack(int size) {
        this.size = size;
        arr = new Object[size];
    }

    public void Size_increase() {
        int newSize = size * 2;
        Object[] temp = new Object[newSize];
        for (int i = 0; i < size; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
        this.size = newSize;
    }

    //                       adding part
    public void add(T data) {
        if (index == size - 1) {
            Size_increase();
        }

        index++;
        arr[index] = data;
    }

    public void delete() throws Custom_Exception {
        if (index < 0) {
            throw new Custom_Exception("this is underflow condition |--------------");
        }
        index--;
    }


    //     display
    public void display() {
        System.out.println("--------");
        for (int i = index; i >= 0; i--) {
            System.out.println("| " + arr[i] + " | ");
        }
        System.out.print("_________");
    }


    public static void main(String[] args) {
//        Custom_Stack<Integer> stack = new Custom_Stack<>();
//        stack.add(1);
//        stack.add(2);
//        stack.add(3);
//
//        stack.delete();
//
//        stack.add(4);
//
//        System.out.println(stack.index);


        Custom_Stack<String> stack = new Custom_Stack<>(5);
        stack.add("krish");
        stack.add("shivam");
        stack.add("sourav");
        stack.add("sujal");
        stack.add("ankit");
        stack.add("dharu");
        stack.add("dharu");
        stack.add("dharu");

//        stack.delete();

        System.out.println(stack.size);
        stack.display();

    }
}