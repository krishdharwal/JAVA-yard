public class WOrdcount {
    public static void main(String[] args) {
        String[] arr = {"a","abc","bc","d"};
        String word = "abc";
        int count = 0;
        for (String i : arr){
            if (word.contains(i)){
                System.out.println(i);
                count++;
            }
        }
    System.out.println(count);
    }
}
