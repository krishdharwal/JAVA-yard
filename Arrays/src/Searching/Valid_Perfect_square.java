package Searching;

public class Valid_Perfect_square {

    public static boolean isPerfectSquare(int num) {
        if(num < 2){
            return true;
        }
        long s = 0;
        long e = num / 2;
        while (s <= e){
            long m = s + (e - s) / 2;
            long sqrt = m * m;
            if (sqrt == num){
                return true;
            }
            else if (sqrt > num){
                e = m-1;
            }else {
                s = m + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(808201));
    }

}
