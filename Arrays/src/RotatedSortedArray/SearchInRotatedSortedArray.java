package RotatedSortedArray;

public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        int piv = pivot(nums);
        System.out.println(piv);
        if(piv >= 0){
            // find from pivot
            if(nums[piv] == target) return piv;
            if(nums[0] <= target) return binarySearch(nums,target,0,piv-1);
            else return binarySearch(nums,target,piv+1,nums.length-1);
        }
        return binarySearch(nums,target,0,nums.length-1);
    }

    public int binarySearch(int[] nums,int tar,int s, int e){
        while(s <= e){
            int m = s + (e - s) / 2;
            if(nums[m] == tar) return m;
            else if(nums[m] > tar) e = m-1;
            else s = m+1;
        }
        return -1;
    }

    public int pivot(int[] nums){
        int s = 0;
        int n = nums.length-1;
        int e = n;
        while(s <= e){
            int m = s + (e - s) / 2;
            if(m < n && nums[m] > nums[m+1]) return m+1;
            else if(m > 0 && nums[m-1] > nums[m]) return m;
            else if(nums[s] >= nums[m]) e = m-1;
            else s = m+1;
        }
        // return -1 when the array is not sorted
        return -1;
    }
}
