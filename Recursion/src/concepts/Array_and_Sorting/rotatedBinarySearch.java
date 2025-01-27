package concepts.Array_and_Sorting;

public class rotatedBinarySearch {

    public static int rotatedBinarySearchAlgo(int[] arr, int tar){
        int pivot = findPivotIndex(arr,0,arr.length-1);
        if (arr[0] < arr[arr.length-1]) return binarySearch(arr,0, arr.length-1,tar);
        if (arr[pivot] == tar) return pivot;
        if (tar < arr[0]) return binarySearch(arr,pivot+1,arr.length-1,tar);
        return binarySearch(arr,0,pivot,tar);
    }

    public static int binarySearch(int[] arr,int s , int e,int t){
        if (s > e){
            return -1;
        }
        int m = s + (e - s) / 2;
        if (arr[m] == t) return m;
        else if (arr[m] < t) return binarySearch(arr,m+1,e,t);
        return binarySearch(arr,s,m-1,t);
    }

    public static int findPivotIndex(int[] arr,int s , int e) {
        if (s > e){
            return arr[arr.length-1];
        }
        int m = s + (e - s) / 2;
        if (m < arr.length-1 && arr[m] > arr[m+1]) return m;
        else if (m > 0 && arr[m-1] > arr[m]) return m-1;
        else if (arr[s] < arr[m]) return findPivotIndex(arr,m,e);
        return findPivotIndex(arr,s,m-1);
    }


    public static void main(String[] args) {
//        System.out.println(findPivotIndex(new int[]{4,5,6},0,2));
//        System.out.println(binarySearch(new int[]{1,3,5,6,7},0,4,6));
        System.out.println(rotatedBinarySearchAlgo(new int[]{1,2,3,4,5,6},4));
    }

}
