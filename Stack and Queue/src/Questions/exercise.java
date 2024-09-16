package Questions;

import java.util.Stack;

public class exercise {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(2);
        stack.push(1);
        stack.push(5);
        stack.push(6);
        stack.push(2);
        stack.push(3);
        
        int[] arr = {2,1,5,6,2,3};
        
        int ans = arr[stack.peek()];
//        int ans = stack.peek();
        System.out.println(ans);
    }
}
