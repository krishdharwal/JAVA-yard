import java.util.Arrays;

public class LongestPriflix {
    public static void main(String[] args) {

        // iske andar apne har word ko match karna hai
        // or jo bhi word jitna bhi same hoga uta return karna hai
        //  (ie) - fl , fl , fl same hai toh return hoga fl
        // (ie2)

        String[] arr = {"flight","fly","flew"};
        String[] arr2 = {"car","racecar","hola"};
        String ans = findPrifix(arr);
        if(!ans.isEmpty() ){
         System.out.println( ans);
        }
        else System.out.println("sorry not found anyone similar");



    }

    private static String findPrifix(String[] arr) {
        // ek string builder banaya
        StringBuilder result = new StringBuilder();
        // usko sort kar diya
        Arrays.sort(arr);


        char[] first = arr[0].toCharArray();
        char[] last = arr[arr.length-1].toCharArray();

        for (int i = 0; i < first.length; i++) {
            if (first[i] != last[i]){
                break;
            }
            result.append(first[i]);

        }
        return result.toString();
    }


}
