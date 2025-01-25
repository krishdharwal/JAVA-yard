package concepts;

import java.util.ArrayList;

public class linear2 {
    public static void main(String[] args) {
        int[] ans = {1,3,2,4,5};
        ArrayList<Integer> ansd = rev(ans,0,3);
        System.out.println(ansd);
    }

    private static ArrayList<Integer> rev(int[] arr,int i,int tar) {
        ArrayList<Integer> list= new ArrayList<>();
        if (i == arr.length) return list;
        if(arr[i] == tar ) list.add(i);
      ArrayList<Integer> below = rev(arr,i+1,tar);
      list.addAll(below);
      return list;
    }
}