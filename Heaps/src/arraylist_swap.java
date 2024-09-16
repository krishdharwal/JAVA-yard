import java.util.ArrayList;

public class arraylist_swap {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
//        System.out.println(list.get(1));
//        list.set(0,9);
        System.out.println(list);
//        swap(list,1,2);
//        swap(list.indexOf(1),list.indexOf(3) );

        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        System.out.println(sum);
    }
    public static void swap(ArrayList<Integer> list,int a,int b){
        int temp = list.get(a);
        list.set(a,list.get(b));
        list.set(b,temp);
        System.out.println(list);
    }
}
