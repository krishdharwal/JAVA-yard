package Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KLE {
    public ArrayList<Integer> kLargest(int[] arr, int k) {

        int n = arr.length-1;
        for (int i = n / 2 ; i >= 0; i--) {
            convertArrayToHeapByDownHeap(arr,i);
        }
        System.out.println(Arrays.toString(arr));
        return kThLargest(arr,k);
    }

    private ArrayList<Integer> kThLargest(int[] arr, int k) {
        // remove the first element and swap last to first and do downheap
        return null;
    }

    public void upheap(int[] arr, int idx){

    }

    private void convertArrayToHeapByDownHeap(int[] arr, int parent) {
        if (parent > arr.length-1){
            return;
        }
        int left = parent * 2 + 1;
        int right = parent * 2 + 2;
        int babySitter = parent;

        if (left < arr.length && arr[parent] - arr[left] < 0){
            babySitter = left;
        }
        if (right < arr.length && arr[parent] - arr[right] < 0){
            babySitter = right;
        }

        if (parent != babySitter){
            int temp = arr[parent];
            arr[parent] = arr[babySitter];
            arr[babySitter] = temp;

            convertArrayToHeapByDownHeap(arr,babySitter);
        }
    }

    public static void main(String[] args) {
        KLE k = new KLE();
        k.kLargest(new int[]{3,12,45,5,67,2,4},0);
    }


}
