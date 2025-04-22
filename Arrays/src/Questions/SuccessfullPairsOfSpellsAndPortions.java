package Questions;

public class SuccessfullPairsOfSpellsAndPortions {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {

        int sLen = spells.length;
        int[] ans = new int[sLen];
        Arrays.sort(potions);

        for(int i = 0; i < sLen; i++){
            ans[i] = findPairs(potions,spells[i],success);
        }
        return ans;
    }

    public int findPairs(int[] arr,int j,long t){
        int n = arr.length-1;
        int s = 0;
        int e = n;
        while(s <= e){
            int m = s + (e - s) / 2;
            long prod = (long) arr[m] * j;
            if(prod >= t) e = m-1;
            else s = m + 1;
        }

        return n - e;
    }
}
