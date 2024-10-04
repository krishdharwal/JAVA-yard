package Questions;

public class countArrayinList {
}
//public class canArrays {
//    public static boolean canArrange(int[] arr, int k) {
//        int ans = helper(arr,k,0,0);
//        if (ans == arr.length / 2){
//            return true;
//        }
//        else {
//            return false;
//        }
//    }
//    public static int helper(int[] arr,int k,int count,int i){
//        if (i == arr.length-1 || i < 0 ){
//            return count;
//        }
//
//        int sum = arr[i] + arr[i+1];
//         if (sum % k == 0){
//            count = count+1;
//        }
//
//        helper(arr,k,count,i + 1,j);
//        helper(arr,k,count,i,j + 1);
//
//        return count;
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5,10,6,7,8,9};
//        System.out.println(canArrange(arr,5));
//    }
//}
