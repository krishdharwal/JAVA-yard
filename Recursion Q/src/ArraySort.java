public class ArraySort {
    public static void main(String[] args){
        int[] arr  = {2,3,4,2};
        System.out.println(isSorted(arr,0));
    }

    private static boolean isSorted(int[] arr,int i) {
        if (i == arr.length-1){
            return true;
        }
        return arr[i] < arr[i+1] && isSorted(arr,i+1);
    }
}
