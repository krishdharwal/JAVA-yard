package learning;

import java.util.Arrays;

public class Sentence_similarity {
    public static boolean areSentencesSimilar(String sentence1, String sentence2) {
        String[] s1 = sentence1.split(" ");
        String[] s2 = sentence2.split(" ");

          if (s1[0].equals(s2[0]) || s1[s1.length-1].equals(s2[s2.length-1])){
              return true;
          }
          return false;

    }

    public static void main(String[] args) {
        String sentence1 = "luky", sentence2 = "Luckkky";
        System.out.println(areSentencesSimilar(sentence1,sentence2));
    }
}
