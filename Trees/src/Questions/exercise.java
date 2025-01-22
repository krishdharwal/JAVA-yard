package Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class exercise {


    public static void call(int[] arr,int s,int e) {
        if (s > e) return;

        int m = s + (e - s) / 2;
        System.out.println(arr[m]);
        call(arr, s, m - 1);
        call(arr, m + 1, e);

    }


    public static void main(String[] args) {
//        int[] arr = {-10,-3,0,5,9};
//        call(arr,0,arr.length-1);

        // this is how to reverse a string
        String j = "dqe,fd,efuhwe,fdwe";
//        String k = new StringBuffer("dsefde").reverse().toString();
//
//
////        List<String> list = j.lines().toList();
////        System.out.println(list);
//
//        String[] str = j.split(",");
//        System.out.println(Arrays.toString(str));
        List<String> list = new ArrayList<>(Arrays.asList(j.split(",")));
        list.add("a");
        list.add("b");
        System.out.println(list);

        list.removeFirst();
        System.out.println(list.get(0));

    }
}
