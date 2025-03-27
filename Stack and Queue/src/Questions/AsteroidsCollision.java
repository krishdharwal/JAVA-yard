package Questions;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

public class AsteroidsCollision {

    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        int i = 0;
        while (i < asteroids.length){

            if (stack.isEmpty() || stack.peek() < 0 || asteroids[i] > 0){
                stack.push(asteroids[i]);
                i++;
            }else {
                if (stack.peek() > 0 && asteroids[i] < 0){

                    int a = stack.peek();
                    int b = Math.abs(asteroids[i]);

                    if (a > b){
                        i++;
                    } else if (a - b == 0) {
                        i++;
                        stack.pop();
                    } else {
                        stack.pop();
                        // don't i++
                    }

                }
            }

        }
        System.out.println(stack);
        int[] result = new int[stack.size()];
        for (int j = 0; j < stack.size(); j++) {
            result[j] = stack.get(j);
        }

        return result;
    }

    public static void main(String[] args) {
        AsteroidsCollision a = new AsteroidsCollision();
        System.out.println(Arrays.toString(a.asteroidCollision(new int[]{10,2,-5})));
    }

}
