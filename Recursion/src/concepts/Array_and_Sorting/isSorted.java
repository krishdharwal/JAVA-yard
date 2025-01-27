package concepts.Array_and_Sorting;

public class isSorted {

    public static boolean isSortedArray(int[] arr,int idx){
        if (idx >= arr.length-1){
            return true;
        }
        return (arr[idx] < arr[idx+1]) && isSortedArray(arr,idx+1);
    }

    public static void main(String[] args) {
        System.out.println(isSortedArray(new int[]{1,2,9,4,6},0));
    }

}
