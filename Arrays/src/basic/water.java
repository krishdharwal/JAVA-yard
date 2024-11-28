package basic;

public class water {

    public static int maxArea(int[] height) {
        int s = 0;
        int e = height.length - 1;
        int sm = 0;
        int em = 0;
        while(s < e){
            if (height[s] > sm) sm = height[s];
            if (height[e] > em) em = height[e];

            s++;
            e--;
        }
        System.out.println(s + " " +  e);
        return 0;
    }


    public static void main(String[] args) {
        maxArea(new int[]{1,8,6,2,5,4,8,3,7});
    }

}
