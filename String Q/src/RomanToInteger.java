public class RomanToInteger {
    public static void main(String[] args) {
        String roman = "IX";
      int ans =  RomantoInt(roman,roman.length()-1);
        System.out.println(ans);
    }
    private static int RomantoInt(String roman,int i) {
        int sum = 0;
        while (i >= 0){
            char ch = roman.charAt(i);
            switch (ch){
                case 'I' :
                    sum += sum >= 1 ? -1 : 1;
                    break;
                case 'V' :
                    sum += sum >= 5 ? -5 : 5;
                    break;
                case 'X' :
                    sum += sum >= 10 ? -10 : 10;
                    break;
            }
            i--;
        }
        return sum;
    }
}


