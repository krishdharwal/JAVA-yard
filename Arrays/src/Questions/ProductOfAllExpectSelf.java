package Questions;

import java.util.Arrays;

public class ProductOfAllExpectSelf {
    public int[] productExceptSelf(int[] nums) {
        int maxProd = 1;
        int zeroConditionProd = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0){
                zeroConditionProd *= nums[i];
            } maxProd *= nums[i];
        }
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0){
                ans[i] = zeroConditionProd;
            }
            else {
                ans[i] = maxProd / nums[i];
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        ProductOfAllExpectSelf p = new ProductOfAllExpectSelf();
        System.out.println(Arrays.toString(p.productExceptSelf(new int[]{9,0,-2})));
        }

}
