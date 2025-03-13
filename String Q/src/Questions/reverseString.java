package Questions;

public class reverseString {

    public String reverseIndividualLetter(String str){
        String[] arr = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = arr.length-1; i >= 0; i--) {
            sb.append(arr[i]).append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        reverseString r = new reverseString();
        String ans =   r.reverseIndividualLetter("the sky is blue");
        System.out.println(ans);
    }

}
