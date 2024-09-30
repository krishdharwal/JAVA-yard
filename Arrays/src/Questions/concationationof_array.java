package Questions;

import java.util.Arrays;

public class concationationof_array {

    public static int[] concentration(int[] arr){
       int[] temp = Arrays.copyOf(arr,arr.length * 2);

        int i = 0 ;
        int k = arr.length;
        while (i < arr.length){
            temp[k++] = arr[i++];
        }
        return temp;
    }

    public static int[] concentration2(int[] arr){
        int[] temp = new int[arr.length * 2];
        System.arraycopy(arr,0,temp,0,arr.length);
        System.arraycopy(arr,0,temp,arr.length,arr.length);
        return temp;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,1};
        System.out.println(Arrays.toString(concentration2(arr)));
    }

}
