package questions.concepts;

import java.util.ArrayList;

public class linear3 {
    public static void main(String[] args) {
        int[] ans = {1,3,2,4,3,4,5};
        ArrayList<Integer> ansd = find(ans,4,0);
        System.out.println(ansd);
    }

    static ArrayList<Integer> list  = new ArrayList<>();
    private static ArrayList<Integer> find(int[] arr, int tar, int i) {
        if (i == arr.length) return list;
        if (arr[i] == tar) list.add(i);
        return find(arr,tar,i+1);
    }
}
