
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Collections.swap;

public class findAllDisspeared {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,8,9,3,3};
      List<Integer> ans =  findAllDisspearedv(arr);
        System.out.println(ans);
    }

    private static List<Integer> findAllDisspearedv(int[] arr) {
        List<Integer> dupli = new ArrayList<>();
        int i = 0;
        while(i < arr.length){
            int chk = arr[i] -1 ;
            if (arr[i] == arr[chk])
            {
                i++;
            }
            else{
                swap(arr,i,chk);
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) dupli.add(j + 1);
        }
        return dupli;

    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a]  = arr[b];
        arr[b] = temp;

    }
}
