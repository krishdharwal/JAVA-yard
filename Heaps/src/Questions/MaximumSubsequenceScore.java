package Questions;

import java.util.ArrayList;
import java.util.List;

class MaximumSubsequenceScore {

    long max = 0;
    public long maxScore(int[] nums1, int[] nums2, int k) {
        findMaxScore(nums1,nums2,k,0,0);
        return max;
    }

    private void findMaxScore(int[] nums1, int[] nums2, int k, long prefixSum, long min) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        int i  = list.indexOf(4);
        
    }

}