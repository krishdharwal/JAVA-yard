package questions;

import java.util.Stack;

public class sortStack {

    public Stack<Integer> sort(Stack<Integer> s) {
        Stack<Integer> ans = new Stack<>();
        doSort(s,ans);
        return ans;
    }

    private void doSort(Stack<Integer> stack, Stack<Integer> ans) {
        if (stack.isEmpty()){
            return;
        }
        int max = 0;
        for (int i = 0; i < stack.size(); i++) {
            if (stack.get(max) < stack.get(i)){
                max = i;
            }
        }
            swap(stack,ans,max);

        doSort(stack, ans);
    }

    public void swap(Stack<Integer> stack , Stack<Integer> ans, int idx){
        int val = stack.remove(idx);
        ans.push(val);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
//        for (int i = 1; i <= 5; i--) {
//    }
            stack.push(11);
            stack.push(2);
            stack.push(32);
            stack.push(3);
            stack.push(41);

//        stack.add(3);
//        stack.add(2);
//        stack.add(1);

        sortStack s = new sortStack();
        System.out.println(stack);
        stack = s.sort(stack);
        System.out.println(stack);

//        System.out.println(stack);
    }
}
