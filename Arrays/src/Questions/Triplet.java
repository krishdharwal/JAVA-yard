    public boolean increasingTriplet(int[] nums) {
      int i = Integer.MAX_VALUE;
      int j = Integer.MAX_VALUE;

      for(int ele : nums){
        if(ele <= i) i = ele;
        else if(ele <= j)  j = ele;
        else return true;
      }

      return false;
}
