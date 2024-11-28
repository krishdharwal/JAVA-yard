package Searching;

public class Q744_find_the_smallest_letter {
    public static char nextGreatestLetter(char[] letters, char target) {
    int s = 0;
    int e = letters.length-1;

    while (s < e){
        int m = s + (e - s) / 2;
       if(letters[m] < target){
           s = m + 1;
       }else {
           e = m - 1;
       }
    }
    return letters[s % letters.length];
    }

    public static void main(String[] args) {
        char[] arr = {'c','f','j'};
        System.out.println(nextGreatestLetter(arr,'a'));
    }

}
