package basic;

public class find_duplicates {

    public int findDuplicate(int[] nums) {
        // doing via fast and slow pointer
        int s = 0;
        int f = 0;

        do {
            s = nums[s];
            f = nums[nums[f]];
        }
        while(s != f);

        s = 0;
        while (s != f){
            s = nums[s];
            f = nums[f];
        }

        return s;


    }


    public int findDuplicate2(int[] nums) {
        // int i = 0;
        // while(i < nums.length){
        //     int cv = nums[i]-1;
        //     if(nums[i]!=nums[cv])
        //        {
        //         int t = nums[i];
        //         nums[i]=nums[cv];
        //         nums[cv] = t;
        //         }
        //     else{
        //         i++;
        //     }
        // }
        // System.out.print(Arrays.toString(nums));
        // for(int j = 0;j<nums.length;j++){
        //     if(nums[j] != j+1)
        //       return nums[j];
        // }
        // return 0;
        boolean a[] = new boolean[nums.length];
        for(int n:nums){
            if(a[n])
                return n;
            a[n]=true;
        }
        return 0;
    }

}
