package Questions;

public class FindPivIndex {
    public int pivotIndex(int[] nums) {
        for (int i = 1; i < nums.length-1; i++) {
            if (haveEqualSum(nums,i)){
                return i;
            }
        }
        return -1;
    }

    public boolean haveEqualSum(int[] nums,int piv){
        int leftSum = 0;
        int rightSum = 0;
        int i = 0;
        int j = piv+1;
        while (j < nums.length){
            if (i < piv){
                leftSum += nums[i++];
                i++;
            }

            if (i == piv){
                rightSum += nums[j++];
            }
        }

        return leftSum == rightSum;
    }

    public static void main(String[] args) {
        FindPivIndex f = new FindPivIndex();
        System.out.println(f.pivotIndex(new int[]{1,7,3,6,5,6}));
    }
}
