package Questions;

import java.util.Arrays;

public class CustomStack {

        public int idx;
        public int[] stk;

        public CustomStack(int maxSize) {
            stk = new int[maxSize];
            idx = 0;
        }

        public void push(int x) {
            if(idx == stk.length){
                return;
            }
            stk[idx] = x;
            idx++;
        }

        public int pop() {
            if(idx < 1){
                return -1;
            }
            int poped = stk[idx-1];
            idx--;
            return poped;
        }

        public void increment(int k, int val) {
            if (k >= stk.length){
                k = idx;
            }
            for (int i = 0; i < k; i++) {
                stk[i] = stk[i] + val;
            }
        }

    public static void main(String[] args) {
        CustomStack stack =  new CustomStack(3);
        stack.push(1);
        stack.push(2);
//        System.out.println(stack.pop());
//        stack.push(2);
        stack.push(3);
//        stack.push(4);
        stack.increment(5,100);
        stack.increment(2,100);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        stack.display();
    }


    public void display(){
        System.out.println(Arrays.toString(stk));
        System.out.println("Index -> " + idx);
    }
    }

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */

