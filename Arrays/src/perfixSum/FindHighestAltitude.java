package perfixSum;

public class FindHighestAltitude {
    public int largestAltitude(int[] gain) {
        int curr = 0;
        int max = 0;
        for(int i=0; i<gain.length; i++){
            curr = curr + gain[i];
            max = Math.max(max,curr);
        }
        return max;
    }
}
