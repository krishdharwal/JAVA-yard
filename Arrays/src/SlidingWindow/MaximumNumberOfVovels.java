package SlidingWindow;

public class MaximumNumberOfVovels {

    public int maxVowels(String str, int k) {
        int s = 0;
        int e = k;
        int count = 0;

        // a possible ans
        for (int i = 0; i < k; i++) {
            char ch = str.charAt(i);
            if(vovelChecker(ch)){
                count++;
            }
        }
        int currCount = count;
        while (e < str.length()){

            currCount = (vovelChecker(str.charAt(s++))) ? currCount - 1 : currCount;
            currCount = (vovelChecker(str.charAt(e++))) ? currCount + 1 : currCount;

            count = Math.max(count,currCount);
        }
        return count;
    }

    public boolean vovelChecker(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        MaximumNumberOfVovels m = new MaximumNumberOfVovels();
       int ans =  m.maxVowels("leetcode",3);
        System.out.println(ans);
    }

}
