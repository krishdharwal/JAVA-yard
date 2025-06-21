package Questions;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i=n-1; i>=0; i--){
            if(digits[i] < 9){
                // simply increase a number and return it
                digits[i]++;
                return digits;
            }
            else{
                digits[i] = 0;
            }
        }
        // if every thing is 9
        digits = new int[n+1];
        digits[0] = 1;
        return digits;
    }
}
