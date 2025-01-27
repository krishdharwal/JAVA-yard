package concepts.Array_and_Sorting;

import java.util.ArrayList;
import java.util.List;

public class linearSearch {
    public static int linearSearchAlgo(int[] arr,int tar,int i){
        if (i == arr.length){
            return -1;
        }

        if(tar == arr[i]){
            return i;
        }

        return linearSearchAlgo(arr,tar,i+1);
    }


    // now find all the index that are equals to the target index
    public static List<Integer> list = new ArrayList<>();
    public static List<Integer> findAllTargetIndexes(int[] arr , int tar , int i){
        if (i == arr.length){
            return list;
        }

        if (tar == arr[i]) {
            list.add(i);
        }

        return findAllTargetIndexes(arr,tar,i+1);
    }


    // pass list inside the parameter
    public static List<Integer> findAllTargetIndexes2(int[] arr,List<Integer> list2, int tar , int i){
        if (i == arr.length){
            return list2;
        }

        if (tar == arr[i]) {
            list2.add(i);
        }

        // keep refrencing the list to the new list from below calls
        list2 = findAllTargetIndexes2(arr,list2,tar,i+1);

        return list2;
    }


    public static void main(String[] args) {
//        System.out.println(linearSearchAlgo(new int[]{1,3,5,7,9},0,0));
        System.out.println(findAllTargetIndexes2(new int[]{1,3,5,3,9},new ArrayList<>(),3,0));
    }
}
