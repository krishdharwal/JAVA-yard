package Questions;


import java.util.Arrays;


public class Plus_One {
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length-1; i >= 0 ; i--) {
            if (digits[i] < 9){
                digits[i]++;
                return digits;
            }
            else {
                digits[i] = 0;
            }
        }
        digits = new int[digits.length +1];
        digits[0] = 1;
        return digits;
    }

    public static void main(String[] args) {
     int[] arr = {9,9};
        System.out.println(Arrays.toString(plusOne(arr)));
    }
}


// to merge a number
//int i = 19;
//int k = 3;
//i = i * 10 + k;
//--> output : 193