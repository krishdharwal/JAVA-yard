package Questions;

class MaximumSubsequenceScore {

    long max = 0;
    public long maxScore(int[] nums1, int[] nums2, int k) {
        findMaxScore(nums1,nums2,k,0,0);
        return max;
    }

    private void findMaxScore(int[] nums1, int[] nums2, int k, long prefixSum, long min) {
        
    }

}