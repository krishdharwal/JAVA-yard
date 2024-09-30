package Questions;

public class Good_pairs {
    public static int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {

            int k = nums.length-1;
            while(k > i){
                if (nums[i] == nums[k]){
                    count++;
                }

                k--;
            }

        }
        return count;
    }

    public static int numIdenticalPairs2(int[] nums) {
        int ans = 0;
        int[] arr = new int[101];
        for (int a: nums) {
            ans += arr[a]++;
        }
        return ans;
        }


        public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,3};
        System.out.println(numIdenticalPairs2(arr));
    }
}
