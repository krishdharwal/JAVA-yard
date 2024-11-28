import java.util.Arrays;

public class faircandy {
    public static void main(String[] args) {
        int[] alice = {1,1};
        int[] bob = {2,2};
        int[] ans  = fair(alice,bob);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] fair(int[] alice, int[] bob) {
        int Acandy = 0,Bcandy =0;
        for (int i : alice) {
            Acandy += i;
        }
        for (int i : bob) {
            Bcandy += i;
        }

        int m = (Bcandy-Acandy) / 2;
        for (int i : alice){
            for (int j : bob){
                if (i - j == m) return new int[]{i,j};
            }

        }
        return new int[]{0};

    }
}
