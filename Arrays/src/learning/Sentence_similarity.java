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

        public boolean areSentencesSimilar2(String sentence1, String sentence2) {
            String[] s1 = sentence1.split(" ");
            String[] s2 = sentence2.split(" ");

            // Ensure that s1 is the shorter one for easy comparison
            if (s1.length > s2.length) {
                String[] temp = s1;
                s1 = s2;
                s2 = temp;
            }

            // Check if s1 is a prefix or suffix of s2
            int i = 0, j = 0;
            while (i < s1.length && s1[i].equals(s2[i])) {
                i++;
            }
            while (j < s1.length && s1[s1.length - 1 - j].equals(s2[s2.length - 1 - j])) {
                j++;
            }

            // If the entire shorter sentence is a prefix or suffix, return true
            return i + j >= s1.length;
        }


    public static void main(String[] args) {
        String sentence1 = "luky", sentence2 = "Luckkky";
        System.out.println(areSentencesSimilar(sentence1,sentence2));
    }
}
