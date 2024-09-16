
public class reverse3 {
    public static void main(String[] args){
        // reverse the string by word by word  ie( olleh ym eman ... )
        String word = "hello my name your daddy";
        // we will reverse when the space will hit
        // two pointers
        System.out.println( reverseIII(word));
            }

    private static String reverseIII(String word) {
        char[] arr = word.toCharArray();
        int l = 0;
        int r = 0;
        while (r < arr.length){
            if (arr[r] == ' '){
                helper(arr,l,r-1);
                l =  r+1;
            }
            r++;
        }
        // last word
        helper(arr,l,r-1);
        return new String(arr);
    }

    private static void helper(char[] arr,int l,int r) {
        while (l < r){
            char temp = arr[l];
            arr[l++] = arr[r];
            arr[r--] = temp;
        }

    }
}
