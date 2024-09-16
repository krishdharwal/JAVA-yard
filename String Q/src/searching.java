import java.util.Arrays;

public class searching{
    public static void main(String[] args){
        int[] arr = {5,4,3,2,1,7,8,9,12,23};
        int[] ans = mergeSort(arr);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] mergeSort(int[] arr){
        if (arr.length == 1){
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

       return mergeJoin(left,right);
    }

    public static int[] mergeJoin(int[] left,int[] right){
        int[] temp = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < left.length && j < right.length){
            if(left[i] < right[j]){
                temp[k] = left[i++];
            }
            else if(left[i] > right[j]){
                temp[k] = right[j++];
            }
            k++;

        }
        while(i < left.length){
            temp[k++] = left[i++];
        }
        while(j < right.length){
            temp[k++] = right[j++];
        }
        return temp;
    }
}
