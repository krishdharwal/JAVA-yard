import java.util.Scanner;

public class binary_search {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {12,23,45,67,87,99,101};
        System.out.println("enter targert");
        int tar = in.nextInt();
        System.out.println(binary(arr,tar));
    }
    static int binary(int[] arr, int tar){
        int start = 0;
        int end = arr.length -1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (tar < arr[mid]) {
                end = mid - 1;
            }
            else if (tar > arr[mid]) {
                start = mid + 1;

           
            } else {
                return mid +1 ;
            }
        }
        return -1;
    }
}
