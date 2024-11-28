package OOP_6;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArraylist {
    private int[] arr;
   public int size = 0;
   public static int defaultsize = 5;

   CustomArraylist(){
       this.arr = new int[defaultsize];
   }

   public void add(int num){
       if (isfull()){
           sizeINC();
       }
       arr[size++] = num;
   }

    public void sizeINC() {
      int[] temp = new int[defaultsize * 2];

        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
    }

    public boolean isfull() {
       return size == arr.length;
    }

    public int get(int i){
       return arr[i];

    }

    public void set(int idx,int ele){
       arr[idx] = ele;
    }

    public int remove(){
       return arr[--size];
//        int rmv = arr[--size];
//        return rmv;
    }


    @Override
    public String toString() {
        return "CustomArraylist{" +
                "arr=" + Arrays.toString(arr) +
                ", size=" + size +
                '}';
    }
}

class call{
    public static void main(String[] args) {
//        ArrayList<Integer> list  = new ArrayList<>();
//        list.add(99);

        CustomArraylist list = new CustomArraylist();
        list.add(9);
        list.add(20);
        list.add(222);
        list.add(33);
        list.add(22);
        list.add(1);
        list.add(2);
//        System.out.println(list.size);
//        list.sizeINC();
        System.out.println(list);

        list.remove();
        System.out.println(list);

    }

}