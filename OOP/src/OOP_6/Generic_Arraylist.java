package OOP_6;

import java.util.Arrays;

public class Generic_Arraylist<T> {
    // here "T" will act as datatype
    // the almighty object will work as class
    private Object[] arr;
    public static int size  =  10;
    public int idx;

    Generic_Arraylist(){
        arr = new Object[size];
    }

    // adding the new elements
    public void add(T ele){
        if (idx == size){
            Object[] temp = new Object[size * 2];
            for (int i = 0; i < size; i++) {
                temp[i] = arr[i];
            }
            arr = temp;
        }
        arr[idx++] = ele;
    }

    // removing elements
    public void remove(int i,T newE){
        for (int j = i; j < idx; j++) {
            arr[j] = arr[j+1];
        }
    }

    // to get element at specific location
    public void get(int i){
        System.out.println(arr[i]);
    }

    // resetting element
    public void reset(int i,T ele){
        arr[i] = ele;
    }

    @Override
    public String
    toString() {
        return "Generic_Arraylist{" +
                "arr=" + Arrays.toString(arr) +
                ", idx=" + idx +
                '}';
    }
}

class making{
    public static void main(String[] args) {
    Generic_Arraylist list  = new Generic_Arraylist();
    list.add(12);
    list.add("hello");
    list.add(92.2f);
    list.get(2);
    System.out.println(list);

    Generic_Arraylist<Integer> list2 = new Generic_Arraylist<>();
    list2.add(12);
    list2.add(2222);
}
}