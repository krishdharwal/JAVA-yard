import java.util.Arrays;

public class sorting {
    public static void main(String[] args) {
        int[] arr = {3,2,1,4,5};
//         insertionSort(arr);
//         bubble(arr);
//         selection(arr);
//        quick(arr,0,arr.length-1);
      int[] ans =   merge(arr);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] merge(int[] arr) {
        if (arr.length == 1){
            return arr;
        }
        int m  = arr.length / 2;
        int[] l = merge(Arrays.copyOfRange(arr,0,m));
        int[] r = merge(Arrays.copyOfRange(arr,m,arr.length));

        return merge2(l,r);
    }

    private static int[] merge2(int[] l, int[] r) {
        int[] temp = new int[l.length + r.length];
        int k = 0;
        int s  = 0;
        int e = 0;

        while (s < l.length && e < r.length){
            if (l[s] < r[e]){
                temp[k] = l[s];
                s++;
            }
            else {
                temp[k] = r[e];
                e++;
            }
            k++;
        }
        while (s < l.length){
            temp[k++] = l[s++];
        }
        while (e < r.length){
            temp[k++] = r[e++];
        }
        return temp;
    }







    private static void quick(int[] arr, int l, int h) {
        if (l >= h){
            return;
        }

        int s = l;
        int e = h;
        int p = s + (e - s) / 2;
        while (s <= e){
            while (arr[p] > arr[s]){
                s++;
            }
            while (arr[p] < arr[e]){
                e--;
            }
            if (s <= e){
                swap(arr,s,e);
                s++;
                e--;
            }
        }
        quick(arr,s,h);
        quick(arr,l,e);
    }

    private static void selection(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int last = arr.length- i - 1;
           int  max = maxx(arr,0,last);
             swap(arr,max,last);
        }
        System.out.println(Arrays.toString(arr));
    }

    private static int maxx(int[] arr,int s,int e) {
        int max = 0;
        for (int i = s; i <= e; i++) {
            if (arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }

    private static void bubble(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i+1]){
                swap(arr,i,i+1);
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }




    public static void swap(int[] arr, int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
