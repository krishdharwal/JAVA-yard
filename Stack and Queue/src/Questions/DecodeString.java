package Questions;

import java.util.Stack;

// Two Strings
public class DecodeString {


    /* testcase

     s = 3[a2[c]]

     num stack
     |     |
     |  2  |
     |__3__|

     string builder stack
     |      |
     |   a  |
     |__""__| // this is for the first opening "[" where sb is empty and num is 3

     // this is how its gonna add into stack and at last
     sb will be "c"
     sb = "c"
     k = num
     (a + sb) * k
    */

    public String decodeString(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<StringBuilder>  strStack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        int n = 0;
        for(char ch : s.toCharArray()){

            if(Character.isDigit(ch)){
                n = n * 10 + (ch - '0');
            }
            else if(ch == '['){
                numStack.push(n);
                n = 0;
                strStack.push(sb);
                sb = new StringBuilder();
            }
            else if(ch == ']'){
                int k = numStack.pop();
                StringBuilder temp = sb;
                sb = strStack.pop();
                while(k-- > 0){
                    sb.append(temp);
                }
            }
            else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        DecodeString ds = new DecodeString();
        String ans = ds.decodeString("3[a2[c]]");
        System.out.println(ans);
    }


}
