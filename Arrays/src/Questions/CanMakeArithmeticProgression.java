package Questions;

import java.util.Arrays;

public class CanMakeArithmeticProgression {
    public  boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int space = arr[0] - arr[1];
        for(int i=1; i<arr.length-1; i++){
            if(arr[i] - arr[i+1] != space) return false;
        }
        return true;
    }
}
