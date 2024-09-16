import java.util.Arrays;

import static java.awt.geom.Rectangle2D.intersect;

public class intersection {
    public static void main(String[] args) {
        int[] n1 = {9,4,9,8,4};
        int[] n2= { 4,9,5};
        int[] ans = intersect(n1,n2);
        System.out.println(Arrays.toString(ans));

    }

    private static int[] intersect(int[] n1, int[] n2) {
        int count = 0;
        int[] temp = new int[n2.length];
        for (int i = 0; i < n1.length; i++) {
            for (int j = 0; j < n2.length; j++) {
                if (n1[i] == n2[j]) temp[j] = n2[j];

            }

        }
        return temp;
    }
}
