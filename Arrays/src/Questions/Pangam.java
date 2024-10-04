package Questions;

import java.util.Arrays;

public class Pangam {
    public static boolean checkIfPangram(String sentence) {
        if (sentence.length() < 26){
            return false;
        }

        char[] arr = sentence.toCharArray();
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        if (arr[arr.length-1] == 'z' || arr[arr.length-1] == 'Z'){
            return true;
        }
        return false;
    }

    public static boolean checkIfPangram2(String sentence) {
        if (sentence.length() < 26){
            return false;
        }

        for (char i = 'a'; i <= 'z'; i++) {
            if (sentence.contains(String.valueOf(i))){

            }else {
                return false;
            }
        }
        return true;
    }

        public static void main(String[] args) {
        String s = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram2(s));
    }
}
