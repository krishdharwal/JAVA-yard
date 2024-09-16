public class strLength {
    public static void main(String[] args) {
        String letter = "helloSir";
       int ans =  lengthh(letter);
        System.out.println(ans);
    }

    private static int lengthh(String letter) {
        if (letter.length() == 1){
            return 1;
        }
        return lengthh(letter.substring(1)) +1 ;
    }
}
