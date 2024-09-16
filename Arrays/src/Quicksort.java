import java.util.Arrays;

public class Quicksort {
    public static void main(String[] args) {

        int[] arr = {1,5,3,2,4};
        Quick(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    private static void Quick(int[] arr,int low, int high) {
        if (low >= high) return;
        int s = low;
        int e = high;
        int m = s + (e -  s) / 2;
        int piv = arr[m];
        while(s <= e){
            if ( arr[s] < piv) s++;
            if (piv < arr[e]) e--;
            if (s <= e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        Quick(arr,low,e);
        Quick(arr,s,high);
    }
}



//import java.util.Arrays;

//public class Quicksort {
//    public static void main(String[] args) {
//        int[] arr = {5, 4, 3, 2, 1};
//      sort(arr, 0, arr.length - 1);
//       System.out.println(Arrays.toString(arr));
//        //Arrays.sort(arr);
//    }
//
//    static void sort(int[] nums, int low, int hi) {
//        if (low >= hi) {
//            return;
//        }
//
//        int s = low;
//        int e = hi;
//        int m = s + (e - s) / 2;
//        int pivot = nums[m];
//
//        while (s <= e) {
// if its already sorted it will not swap
////            while (nums[s] < pi
//            // also a reason whyvot) {
//                s++;
//            }
//            while (nums[e] > pivot) {
//                e--;
//            }
//
//            if (s <= e) {
//                int temp = nums[s];
//                nums[s] = nums[e];
//                nums[e] = temp;
//                s++;
//                e--;
//            }
//        }
//
//        // now my pivot is at correct index, please sort two halves now
//        sort(nums, low, e);
//        sort(nums, s, hi);
//    }
//}
