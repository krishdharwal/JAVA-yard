package Questions;

import java.util.ArrayList;
import java.util.List;

public class Kid_with_highest_candy {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> list = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            list.add(maxHelper(candies,extraCandies,i));
        }
        return list;
    }

    public static boolean maxHelper(int[] arr,int extra,int i){
        int currentItem = arr[i] + extra;
        int k = 0;
        while (k < arr.length){
            if (k == i){
                k++;
            }
            else {
                if (arr[k] > currentItem){
                    return false;
                }
                k++;
            }
        }
        return true;
    }


    public static List<Boolean> kidsWithCandies2(int[] candies, int extraCandies) {

        List<Boolean> list = new ArrayList<>();
        // find max number and compare all with that
        int max = 0;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max){
                max = candies[i];
            }
        }

        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= max){
                list.add(true);
            }else {
                list.add(false);
            }

        }

        return list;
    }

        public static void main(String[] args) {
        int[] arr = {2,3,5,1,3};
        System.out.println(kidsWithCandies2(arr,3));
    }
}
