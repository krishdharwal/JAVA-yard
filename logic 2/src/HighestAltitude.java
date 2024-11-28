import java.util.Arrays;
public class HighestAltitude {
    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};

        System.out.println(highestAltitude(gain));
    }

    private static int highestAltitude(int[] gain) {
        int sum = 0;
        int ans = 0 ;
        for (int i = 0; i < gain.length; i++) {
            sum += gain[i];
            ans = Math.max(ans,sum);
        }
        return ans;
    }
}
