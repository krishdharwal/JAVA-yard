package Questions;

import java.util.Arrays;

public class create_array_from_given_target {
    public static int[] createTargetArray(int[] nums, int[] index) {
        int[] temp = new int[nums.length];
        int z = 0;
        for (int i = 0; i < nums.length; i++) {

            int k = index[i];
            if ( z < nums.length  && z > k){
                for (int j = z; j > k; j--) {
                    temp[j] = temp[j-1];

                }
            }

            temp[k] = nums[i];
            z++;
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] arr =   {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
//        System.out.println(Arrays.toString(createTargetArray(arr,index)));

        System.out.println(isLongPressedName("sayeed","sayeed"));

    }

     public static boolean isLongPressedName(String name, String typed) {
        int i = 0;
        int j = 0;

        while (i < name.length()){
            if (name.charAt(i) == typed.charAt(j)){
                  i++;
                  j++;
            }
           else if (j > 0 && typed.charAt(j) == typed.charAt(j-1)){
                j++;
            }
            else {
                return false;
            }
        }
        return true;
     }
}


