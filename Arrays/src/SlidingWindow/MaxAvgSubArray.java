package SlidingWindow;

public class MaxAvgSubArray {
    public double findMaxAverage(int[] nums, int k) {
        if(nums.length == 1) return (double) nums[0];
        int s = 0;
        int e = k;
        double avg = 0;
        for(int i = 0; i < k; i++){
            avg += nums[i];
        }

        double max = avg;
        while(e < nums.length){
            // sub the previous
            avg -= nums[s++];
            // add the upcomming
            avg += nums[e++];
            max = Math.max(max,avg);
        }
        return max / k;
    }
}
