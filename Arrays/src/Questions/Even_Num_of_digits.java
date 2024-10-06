package Questions;

public class Even_Num_of_digits {
    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {

            int check = 0;
            int rem = nums[i];
            while (rem != 0){
                 rem = rem / 10;
                check++;
            }
            if (check % 2 == 0){
                count++;
            }

        }
        return count;
    }


    public int findNumbers2(int[] nums) {
        int evenCount=0;
        for(int i=0;i<nums.length;i++){
            if(((int)(Math.log10(nums[i])+1))%2==0){
                evenCount++;
            }
        }
        return evenCount;
    }

    public static void main(String[] args) {
        int[] arr = {555,901,482,1771};
        System.out.println(findNumbers(arr));
    }
}
