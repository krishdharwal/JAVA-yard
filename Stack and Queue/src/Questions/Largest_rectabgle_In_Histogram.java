package Questions;
import java.util.Stack;


public class Largest_rectabgle_In_Histogram {
    public static void main(String[] args) {
       int[] Histogram = {2,1,5,6,2,3};
       int ans = largestRectangleArea(Histogram);
        System.out.println(ans);
    }


        public static int largestRectangleArea(int[] heights) {
            Stack<Integer> stack = new Stack<>();
            int max = 0;

            stack.push(0);

            for (int i = 1; i < heights.length; i++) {
                while (!stack.isEmpty() && heights[i] < heights[stack.peek()]) {
                    max = getMax(heights, stack, max, i);
                }
                stack.push(i); // putting index in it
            }

            int i = heights.length;
            while (!stack.isEmpty()) {
                max = getMax(heights, stack, max, i);
            }
            return max;
        }

        private static int getMax(int[] arr, Stack<Integer> stack, int max, int i) {
            int area;
            int popped = stack.pop();
            if (stack.isEmpty()) {
                area = arr[popped] * i;
            } else {
                area = arr[popped] * (i - 1 - stack.peek());
            }
            return Math.max(max, area);
        }
}


// stack using to input the index

// stack peek is for the smallest number


/*

 checking part ->
 we are checking how much can we go left side and right side

 checking for smallest number in between current number and  left side
 and for right side checking the largest number


 */