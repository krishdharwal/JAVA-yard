package learning;

import java.util.ArrayList;
import java.util.List;

public class findAllDuplicates {

        public List<Integer> findDuplicates(int[] nums) {
            nums = cyclicSort(nums);
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i < nums.length; i++){
                if(nums[i] != i+1) list.add(nums[i]);
            }
            return list;
        }

        public int[] cyclicSort(int[] arr){

            int i = 0;
            while(i < arr.length){
                int chk = arr[i];
                if(chk < arr.length && arr[chk] == arr[i]){
                    i++;
                }
                else{
                    swap(arr,i,chk);
                }
            }

            return arr;
        }


        public void swap(int[] arr, int a, int b){
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }


    public static void main(String[] args) {
        findAllDuplicates d = new findAllDuplicates();
        d.findDuplicates(new int[]{});
    }

}
