package Questions;

import java.util.Arrays;

public class exercise {
    public static void main(String[] args) {
        int[] arr = {-10,-3,0,5,9};
        call(arr,0,arr.length-1);

    }

    public static void call(int[] arr,int s,int e){
        if(s > e) return;

        int m = s + (e - s) / 2;
        System.out.println(arr[m]);
        call(arr,s,m-1);
        call(arr,m+1,e);
    }

}
