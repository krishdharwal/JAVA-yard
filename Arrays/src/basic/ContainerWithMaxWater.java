package basic;

public class ContainerWithMaxWater {

    public static int maxArea(int[] height)  {
        if (height.length < 1){
            return 0;
        }
        if (height.length == 1){
            return height[0];
        }

        int s = 0;
        int e = height.length-1;
        int maxMain = 0;

        while (s < e){
            // check for max
            int area = Math.min(height[s], height[e]) * (e - s);
            maxMain = Math.max(maxMain, area);

            if (height[s] < height[e]) {
                s++;
            }else{
                e--;
            }
        }
        return maxMain;
    }


    public static void main(String[] args) {
//        System.out.print(maxArea(new int[]{8,7,2,1}));
        for(int i : new int[]{13,32,32}){
            System.out.println(i);
        }
    }
}
