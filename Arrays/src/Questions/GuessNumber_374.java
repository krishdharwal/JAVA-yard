package Questions;

// Binary Search Q - 374
/**
 * Forward declaration of guess API.
 *   your guess
 *  	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */
public class GuessNumber_374 {
    public int guessNumber(int n) {
        int s = 1;
        int e = n;

        while(s < e){
            int m = s + (e - s) / 2;
            int t = guess(m);
            if(t == 0) return m;
            else if(t == -1) e = m-1;
            else s = m+1;
        }
        return s;
    }

    // just avoid this
    private int guess(int n) {
        return n;
    }
}
