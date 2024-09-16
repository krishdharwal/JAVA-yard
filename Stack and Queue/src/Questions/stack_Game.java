package Questions;

import java.util.Arrays;

public class stack_Game {

    public static int Steps(int MaxSum,int[] a,int[] b){
        return Steps(MaxSum,a,b,0,0);
    }

    private static int Steps(int MaxSum,int[] a,int[] b,int sum,int count){
        if (sum > MaxSum){
            return count;
        }
        if (a.length == 0 || b.length == 0){
            return count;
        }

        int left = Steps(MaxSum, Arrays.copyOfRange(a,1,a.length) , b,sum + a[0],count +1);
        int right = Steps(MaxSum,a,Arrays.copyOfRange(b,1,b.length));

        return Math.max(left,right);
    }


    public static void main(String[] args) {
        int[] arr1 = {4,2,4,6,1};
        int[] arr2 = {2,1,8,5};
        int ans = Steps(10,arr1,arr2);
        System.out.println(ans);
    }
}
