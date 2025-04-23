package Questions;

import java.util.Arrays;

// binary search
public class KokoEatingBanana {

    public int minEatingSpeed(int[] piles, int h) {

        int n = piles.length-1;

        int k = 0;
        for(int ele : piles){
            k = Math.max(k,ele);
        }

        int s = 1;
        int e = k;
        int ans = k;

        while (s < e){
            int m = s + (e - s) / 2;
            int currentHour = findProduct(piles,m);
            if (currentHour > h) s = m+1;
            else e = m;
        }
        return s;
    }

    public int findProduct(int[] arr,int speed){
        int hour = 0;
        for(int ele : arr){
            hour += (int) Math.ceil((double) ele / speed);
        }
        return hour;
    }
}
