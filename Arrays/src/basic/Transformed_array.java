package basic;

import java.util.ArrayList;
import java.util.List;

public class Transformed_array {

    public static void constructTransformedArray(int[] nums) {
        int currIdxVal = 0;
        int len = nums.length;
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
          if (nums[i] == 0){
              list.add(nums[i]);
          }
          else {
           int idx = ((i + nums[i]) % len);
           list.add(idx);
          }
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        constructTransformedArray(new int[]{3,-2,1,1});
    }
}
