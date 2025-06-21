package Questions;

public class SignOfAnProductArray {
    public int arraySign(int[] nums) {
        int ans = 1;
        for(int ele : nums){
            if(ele == 0) return ele;
            if(ele < 0) ans = -ans;
        }
        return ans;
    }
}
