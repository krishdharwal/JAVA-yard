//import static java.util.Collections.binarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class searching {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr1 = {2, 1, 3, 4, 5, 67, 12, 322, 23, 23, 44, 2323, 22, 122};
        int[] arr2 = {1, 2, 4, 5, 6, 78, 90, 100};


        int start = 0;
        int end = arr1.length - 1;

        System.out.println("enter a number to search in the array = ");
        int target = in.nextInt();

      //  int linear = linearSearch(arr1, target);
        int binary = binarySearch(arr2, target,start,end);

       // System.out.println(" Ans of Linear search is = " + linear);
        System.out.println("Ans of binary search is  = " + binary);

    }

    private static int linearSearch(int[] arr, int tar) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == tar) {
                return i+1;
            }
        }
        return -1;
    }

    private static int binarySearch(int[] arr, int tar, int start , int end) {
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == tar) return mid+1;

            else if (arr[mid] > tar) return binarySearch(arr,tar,start,mid);

            else return binarySearch(arr,tar,mid+1,end);

        }
        return -1;
    }


}




















