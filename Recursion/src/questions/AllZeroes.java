package questions.concepts;

public class AllZeroes {
    public static void main(String[] args) {
        int c = 0;
        int ans = Zeroes(1202020,0);
        System.out.println(ans);
    }

    private static int coun(int n) {
        return Zeroes(n,0);
    }
    private static int Zeroes(int n,int count) {
        if (n == 0){
            return count;
        }
        if (n%10 == 0){
           return Zeroes(n/10,count+1);
        }
        else return Zeroes(n/10,count);
    }
}
