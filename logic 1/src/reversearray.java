import java.util.Arrays;

public class reversearray {
    public static void main(String[] args) {
        // to reverse the array by loop

        int[] rev = {1,2,3,4,5,6};

        int start = rev[0];
        int end = rev.length-1;
        while(start < end){
            int swap = start;
            start = end;
            end = swap;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(rev));
    }
}
