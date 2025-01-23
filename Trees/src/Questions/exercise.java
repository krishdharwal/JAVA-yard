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
        List<Integer> l1 = Arrays.asList(3,2,1);
        List<Integer> l2 = Arrays.asList(3,1,2);

        System.out.println(l1.equals(l2));

    }
}
