package Searching;

import java.util.Arrays;

public class double_exixsts {

    public static boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        int i = 0;
        while (i <  arr.length){
            if (BS(arr,2 * arr[i],i)){
                return true;
            }
            i++;
        }
        return false;
    }

    public static boolean BS(int[] arr,int t,int i){
//        if (t < 0){
//            return false;
//        }

        int temp = 0;
        if (t == 0){
            temp = arr[i];
            arr[i] = -1;
        }

        int s = 0;
        int e = arr.length-1;

        while (s <= e ){
            int m = s + (e - s) / 2;
            if (arr[m] == t) {
                if (t == 0){
                    arr[i] = temp;
                }
                return true;
            }
            else if (arr[m] < t) s = m + 1;
            else e = m - 1;
        }
        if (t == 0) {
            arr[i] = temp;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkIfExist(new int[]{-10,12,-20,-8,15}));
    }

}
