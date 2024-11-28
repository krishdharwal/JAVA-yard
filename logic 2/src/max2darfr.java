import java.util.Arrays;
import java.util.ArrayList;

public class max2darfr {
    public static void main(String[] args) {
        int[][] mat = {{3,7,8},{9,11,13},{15,16,17}};
        int[] maxSub = {-2,1,-3,4,-1,2,1,-5,4};
       int ans = getmaxsub(maxSub);

        System.out.println(ans);
    }

    private static int getmaxsub(int[] nums){
         int maxSum = nums[0];
         int currentsum = nums[0];

        for (int i = 1; i < nums.length ; i++) {
            currentsum = Math.max(nums[i],currentsum + nums[i]);
            maxSum = Math.max(maxSum,currentsum);

        }
        return maxSum;
    }


//    private static int[] luckyNumber(int[][] mat) {
//        ArrayList<Integer> result = new ArrayList<>();
//
//        int m = mat.length;
//        int n = mat.length;
//
//        int[] minr = new int[m];
//        int[] maxc = new int[n];
//
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                minr[i] = Math.min(minr[i], mat[i][j]);
//                maxc[j] = Math.max(maxc[j], mat[i][j]);
//            }
//        }
//
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                if (mat[i][j] == minr[i] && mat[i][j] == maxc[j]){
//                    result.add(mat[i][j]);
//                }
//            }}
//
//        return result;
//    }


    private static int maxele(int[][] mat) {
        int max = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if( mat[i][j] > max){
                    max = mat[i][j];
                }

            }
        }
        return max;
    }

}
