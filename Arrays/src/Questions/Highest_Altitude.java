package Questions;

import java.util.Arrays;

public class Highest_Altitude {
    public static int largestAltitude(int[] gain) {
        int h = 0;
        int i = 1;
        while(i < gain.length ){
            gain[i] = gain[i] + gain[i-1];
            if(gain[i] > h){
                h = gain[i];
            }
            i++;
        }
        System.out.println(Arrays.toString(gain));
        return h;
    }

    public static void main(String[] args) {
        int[] arr = {-4,-3,-2,-1,4,3,2};
        System.out.println(largestAltitude(arr));
    }
}
//-4,-3,-2,-1,4,3,2