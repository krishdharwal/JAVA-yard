package learning;


/////////////////////////////blunder///////////////////////////


import java.util.Arrays;

public class Mergesort {
    public static void main(String[] args) {


            int[] arr = {5, 4, 3, 2, 1 };
            Merge1(arr);
            System.out.println(Arrays.toString(arr));


        }
        static void Merge1(int[] arr) {
        if (arr.length <= 1 ){
            return;
        }

        //make an temporary array
            int[] temp = new int[arr.length];
        merge2(arr,temp,0,arr.length-1);
    }


    // isme humne tod tod kai mari
    private static void merge2(int[] arr,int[] temp, int start, int end) {
        int mid =0;
        while(start <= end){
             mid = start + (end - start) / 2;
            merge2(arr,temp,start,mid);
            merge2(arr,temp,mid+1, end);
        }

        merge3(arr,temp,start,mid,end);

    }

    // isme marne kai bad phir sili
    private static void merge3(int[] arr, int[] temp, int start, int mid, int end) {
        for (int i = start; i < end ; i++) {
            temp[i] = arr[i];
        }
        int s = start;
        int m = mid +1;
        int e = end;

        // ab compare the two halves
        while(s <= m && m <= e){
            if(temp[s] <= temp[m])
            {
                arr[m] = temp[s];
                s++;
            }
            else {
                arr[m] = temp[e];
                e++;
            }
            m++;
        }

        while(s <= mid){
            arr[m] = temp[s];
            m++;
            s++;
        }
    }
}


