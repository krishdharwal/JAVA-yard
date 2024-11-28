package basic;

public class Rotated_binary_search {
    public static int search(int[] nums, int target) {
        int p =  piv(nums);

        if (p == -1){
          return   bs(nums, 0, nums.length -1,target);
        }
         if (nums[p] == target) return p;
         else if(nums[0] > target) return bs(nums, p + 1, nums.length -1, target);
         else return bs(nums, 0, p - 1, target);
}

static int bs(int[] arr, int s,int e, int tar){
        while(s <= e){
            int m = s + (e - s) / 2;
            if (arr[m] == tar) return m;
            else if(arr[m] > tar) e = m -1 ;
            else s = m + 1;
        }
        return -1;
}


static int piv(int[] nums){
    // find the maximum number in rotate array
    int s = 0;
    int e = nums.length - 1;
    while (s < e) {
        int m = s + (e - s) / 2;
        if (m > 0   && nums[m] < nums[m - 1]){
           return m - 1;
        }
        else if (m < nums.length -1 &&  nums[m] > nums[m + 1]){
           return m + 1;
        }
        else if (nums[s] >= nums[m]) e = m-1;
        else s = m+1;
    }
    return -1;
}




    public static void main(String[] args) {
        System.out.println(search(new int[]{9} , 5));

    }
}