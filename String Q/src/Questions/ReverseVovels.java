package Questions;

public class ReverseVovels {
    public String reverseVowels(String s) {
        String vovels = "aeiouAEIOU";
        char[] arr = s.toCharArray();
        int i = 0;
        int j =  s.length()-1;
        while (i < j){
          while (i < j && !vovels.contains(Character.toString(arr[i]))){
              i++;
          }
          while (j > i && !vovels.contains(Character.toString(arr[j]))){
              j++;
          }
          // swap
            char temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
          i++;
          j++;
        }

        return new String(arr);
    }
}
