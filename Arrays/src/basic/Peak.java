package basic;

public class Peak {


    public  static int findPeakElement(int[] nums) {

        int s = 0;
        int e = nums.length -1;
        while (s < e){
            int m = s + (e - s) / 2;
            if (nums[m] < nums[m+1]) s = m + 1;
            else e = m ;
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(findPeakElement(new int[]{1,2,1,3,4,6,5}));
    }
}
