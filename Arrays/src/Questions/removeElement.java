package Questions;

public class removeElement {


    public int removeElement(int[] nums, int val) {
        int s = 0;
        int e = nums.length-1;

        while (s <= e) {
            if (nums[s] == val) {
                if (nums[e] == val) {
                    e--;
                }else{
                    swap(nums, s, e);
                    s++;
                    e--;
                }
            }else{
                s++;
            }
            
        }

        return e+1;
    }

    public void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static void main(String[] args) {
        int[] arr = {0};
        removeElement removeElement = new removeElement();
        System.out.println(removeElement.removeElement(arr, 0));
    }
}