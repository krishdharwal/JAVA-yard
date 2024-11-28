package basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class b1 {

    public static void main(String[] args) {
//        System.out.println(fibo(5));
//        System.out.println(countDigits(222));
//        System.out.println(Anagrams("silent", "listen"));
        System.out.println(factorial(4));
    }

     // nth fibonacci number
    public static int fibo(int n){

        if (n < 2){
            return 1;
        }

        return fibo(n - 1) + fibo(n - 2);
    }

    public static int countDigits(int n){
        return String.valueOf(n).length();
    }

    public static boolean Anagrams(String s1 , String s2){
        char[] f = s1.toCharArray();
        char[] s = s2.toCharArray();
        Arrays.sort(f);
        Arrays.sort(s);
        return Arrays.equals(f ,s);
        }

        public static void ReverseArray(int[] arr){

        int i = arr.length;
        int j = 0;
        int[] arr2  = new int[arr.length];
        while(i > 0){
            arr2[j++] = arr[i--];
        }
            System.out.println(Arrays.toString(arr));

//        Arrays.stream(arr).distinct().toArray();

        }

        public static void reader(){

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(reader.toString());

        }

        public static boolean PalindromeOrNot(String s){

        s.replaceAll("[^a-zA-Z]","").toLowerCase();
        String ns = new StringBuilder(s).reverse().toString();
            System.out.println(ns);
        return ns.equals(s);
        }

        public static int  factorial(int n){
        if (n == 0 || n == 1){
            return 1;
        }


        return n * factorial(n - 1);

        }



}
