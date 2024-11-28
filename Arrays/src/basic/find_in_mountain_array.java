package basic;

import java.util.Arrays;
import java.util.List;

/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */


class find_in_mountain_array {
    public  static int findInMountainArray(int target, List<Integer> mountainArr) {

        int[] arr = new int[mountainArr.size()];
        for (int i = 0; i < mountainArr.size(); i++) {
            arr[i] = mountainArr.get(i);
        }

        int peak = peak(arr);

        int leftSide = abs(arr, 0, peak, target);
        if(leftSide != -1){
            return leftSide;
        }

        return dbs(arr, peak + 1, arr.length - 1, target);

    }

     static int dbs(int[] arr, int s, int e, int tar) {
         while(s <= e){
             int m = s + (e - s) / 2;
             if (arr[m] == tar) return m;
             else if(arr[m] > tar) s = m + 1;
             else e = m -1;
         }
         return -1;

    }


   static  int abs(int[] arr, int s,int e, int tar){
       while (s <= e) {
           int m = s + (e - s) / 2;
           if (arr[m] == tar)
               return m;
           else if (arr[m] > tar)
               e = m - 1;
           else
               s = m + 1;
       }
       return -1;
    }


    static int peak(int[] arr){
        int s = 0;
        int e = arr.length-1;

        while (s < e){
            int m = s + (e - s) / 2;
            if (arr[m] < arr[m+1]) s = m + 1;
            else e = m;
        }
        return s;
    }


    public static void main(String[] args) {
       int ans =  findInMountainArray(3, Arrays.asList(1,2,3,4,5,3,1));
        System.out.println(ans);
    }

}