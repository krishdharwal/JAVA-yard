public class exercise2 {
    public static void main(String[] args) {
//        String s1 = "ABCABC";
//        String s2 = "ABCABCABC";
//
//        int a =(int) Math.sqrt(s1.length());
//        int b =(int) Math.sqrt(s2.length());
//
//        String k = "abcbab";
//         k = k.replaceAll("a","");
//        System.out.println(k);


//        int  d = 123124;
//        int ans = Integer.toString(d).length();
//        System.out.println(ans);

        int currentDigit = '2' - '0';
        char ch = (char)'a' + 0;
        System.out.println (ch);

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
