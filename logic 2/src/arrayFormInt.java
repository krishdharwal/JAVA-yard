import java.util.Arrays;

public class arrayFormInt {
    public static void main(String[] args) {
          int[] num = {1,2,3,4};
          int k = 34;
          formInt(num,k);
//        System.out.println(ans);


        System.out.println(Arrays.toString(num));
    }

    private static int[] formInt(int[] num, int k) {
        int sum = 0;
        int put = 0;
        for (int i = 0; i < num.length; i++) {
            put = put * 10 + num[i];

        }
        sum = put + k;
        for (int i = num.length-1; i >= 0 ; i--) {
            num[i] = sum % 10;
            sum /= 10;


        }
        return num;
    }
}
