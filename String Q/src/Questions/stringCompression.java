package Questions;


import java.util.Arrays;

public class stringCompression {
    public int compress(char[] chars) {
        int pointer = 0;

        int i = 0;
        while ( i < chars.length ) {
            char ele =  chars[i];
            int counter = 0;

            while(i < chars.length && ele == chars[i]){
                i++;
                counter++;
            }
            chars[pointer++] = ele;

            String str = Integer.toString(counter);

            if (counter > 1) {
                for (int j = 0; j < str.length(); j++) {
                    chars[pointer++] = str.charAt(j);
                }
            }

        }

        System.out.println(Arrays.toString(chars));
        return pointer;

    }

    public static void main(String[] args) {
        stringCompression s = new stringCompression();
       int ans = s.compress(new char[]{'a','a','b','b','c','c','c'});
        System.out.println(ans);
    }
}

/*
 for loop can also be written as

 for(int i = 0; i < 100;){
         i++;
 }

 */