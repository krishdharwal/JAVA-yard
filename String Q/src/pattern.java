public class pattern {
    public static void main(String[] args) {
        String[] pattern = {"a","abc","bc","d"};
        String word = "abc";
        int count = 0;
      for (String idx : pattern){
          if (word.indexOf(idx) >= 0){
              count++;
          }
      }
        System.out.println(count);

        }
}