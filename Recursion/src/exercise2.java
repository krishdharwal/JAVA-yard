public class exercise2 {
    public static void main(String[] args) {
        String s1 = "ABCABC";
        String s2 = "ABCABCABC";

        int a =(int) Math.sqrt(s1.length());
        int b =(int) Math.sqrt(s2.length());

        String k = "abcbab";
         k = k.replaceAll("a","");
        System.out.println(k);
    }



    // Euclid's algo
    static int findCommonDivisor(int i,int j){
        if (i == j){
            return i;
        }
        int g = Math.max(i,j);
        int l = Math.min(i,j);
        return findCommonDivisor(g - l,l);
    }
}
