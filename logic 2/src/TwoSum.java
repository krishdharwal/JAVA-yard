import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int tar = 9;
       int[] ans =   twosumm(arr,tar);

        System.out.println(ans);
    }

    private static int[] twosumm(int[] arr,int tar) {
        int[] temp = new int[1];
        int start = 0;
        int end = arr.length;
        while(start < end){
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
           sum =  arr[start] + arr[start]+1;
             if (sum == tar) {
                 temp[i] = sum;
            }
             else{
                 break;
             }
            }
             start++;
        }
        return temp;
    }
}
