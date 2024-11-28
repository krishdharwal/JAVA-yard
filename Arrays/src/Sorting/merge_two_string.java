package Sorting;

public class merge_two_string {


    public static void mergeAlternately(String word1, String word2) {
        int i = 0;
        int j = 0;
        StringBuilder stringBuilder = new StringBuilder();
        while (i < word1.length() && j < word2.length()){
            stringBuilder.append(word1.charAt(i));
            stringBuilder.append(word2.charAt(j));
            i++;
            j++;
        }

        if (i < word1.length() ){
            stringBuilder.append(word1.substring(i));
        }

        if ( j < word2.length()){
            stringBuilder.append(word2.substring(j));
        }

        System.out.println( stringBuilder.toString());
    }

    public static void main(String[] args) {
        String word1 = "abc", word2 = "pqr";
//        System.out.println(
                mergeAlternately(word1,word2);
//        );

    }

}
