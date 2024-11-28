public class binarySearch {
    public static void main(String[] args) {

            int[] arr = {1,3,5,6};
            int peak = bin(arr,5,0,arr.length-1);
            System.out.println(peak);

    }

    private static int bin(int[] arr, int i,int s ,int e) {

        while (s < e ){
            int m = s + (e - s) / 2;
            if (arr[m] == i) return m;
            else if (arr[m] > i) return bin(arr,i,s,m-1);
            else if (arr[m] < i) return bin(arr,i,m+1,e);

        }
        return -1;
    }
}
