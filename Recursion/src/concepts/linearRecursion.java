package concepts;

import java.util.ArrayList;

public class linearRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4};
    //   ArrayList<Integer> ans =  allindex(arr,4,0,new ArrayList<>());
       int ans =  findTar(arr,4,0);

        System.out.println(findallTarbyAL(arr,4,0));
    }

    //find index
    private static int findTar(int[] arr, int tar,int i) {
        if (i == arr.length-1) return -1;
         if (arr[i] == tar) return i+1;
      return findTar(arr,tar,i+1);
    }

    //find all indexes
//    static ArrayList<Integer> list = new ArrayList<>();
//    private static ArrayList<Integer> findallTar(int[] arr, int tar, int i) {
//        if (i == arr.length) return null;
//        if (arr[i] == tar) list.add(i);
//         findallTar(arr,tar,i+1);
//        return null;
//    }

    // finding all index without outside array list
    private static ArrayList<Integer> findallTarbyAL(int[] arr, int tar,int i) {
        ArrayList<Integer> list = new ArrayList<>();
        if (i == arr.length) return list;
        if (arr[i] == tar) list.add(i);

       ArrayList<Integer> ansfrombelow =  findallTarbyAL(arr,tar,i+1);
       list.addAll(ansfrombelow);
       return list;
    }



    public static ArrayList<Integer> allindex(int[] arr, int tar, int i, ArrayList<Integer> list){
        if (i == arr.length) return list;
        if (arr[i] == tar) list.add(i);
        return allindex(arr,tar,i+1,list);
    }
}
