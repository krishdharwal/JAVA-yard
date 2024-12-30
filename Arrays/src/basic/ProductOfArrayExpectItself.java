package basic;

import javax.naming.NameNotFoundException;
import java.util.Arrays;

public class ProductOfArrayExpectItself {

    // brute force approach
    public int[] productExceptSelf2(int[] nums) {
        int[] arr = new int[nums.length];
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int prod = 1;
            for (int j = 0; j < n; j++) {
                if (j == i){
                    continue;
                }
                prod *= nums[j];
            }
            arr[i] = prod;
        }
        return arr;
    }

    // optimised using two pointers
    public static int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        ans[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            int prod = ans[i - 1] * nums[i - 1];
            ans[i] = prod;
        }
        int rightProd = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
          ans[i] *= rightProd;
          rightProd *= nums[i];
        }

     return ans;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf(new int[]{1,2,3,4})));
    }
    }
//    WTF
class Solution {
    static {
        for (int i = 0; i < 500; i++) {
            productExceptSelf(new int[]{0, 0});
        }
    }
    public static int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int arr[]=new int[n];
        arr[0]=1;
        for(int i=1;i<nums.length;i++){
            arr[i]=arr[i-1]*nums[i-1];
        }
        int suffix=1;
        for(int i=n-2;i>=0;i--){
            suffix=suffix*nums[i+1];
            arr[i]=arr[i]*suffix;
        }
       return arr;
    }
}