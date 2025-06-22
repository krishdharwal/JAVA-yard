package Questions;

public class ReverseWords {
    public String reverseWords(String str) {
        String[] arr = str.trim().split("\\s+");
        String ans = "";
        for(int i = arr.length-1; i>0; i--){
            ans += arr[i] + " ";
        }
        return ans + arr[0];
    }
}
