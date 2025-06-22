package Questions;

public class ReverseCharacterArray {
    public void reverseString(char[] arr) {
        int s = 0,e = arr.length-1;
        while(s < e){
            char temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }


}
