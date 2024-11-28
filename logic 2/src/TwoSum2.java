public class TwoSum2 {
    public static void main(String[] args) {
        int[] arr = {-1,0};
        int tar = -1;
        int ans = twoSum(arr,tar);
        System.out.println(ans);
    }

    private static int twoSum(int[] arr, int tar) {
        int temp = 0;
        int i = 0;
        while (i < arr.length) {

            for (int j = arr.length-1; j>=0; j--) {
                if (arr[i] + arr[j] == tar) temp = i + j ;

        }
                 i++;
        }
        return temp;
    }

}






