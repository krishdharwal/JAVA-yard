public class exercise2 {
    public static void main(String[] args) {
        String s1 = "ABCABC";
        String s2 = "ABCABCABC";

        int a =(int) Math.sqrt(s1.length());
        int b =(int) Math.sqrt(s2.length());
        System.out.println("a = " + a + "\n" + "b = " + b);

//        System.out.println("div" + 2 / 3 + "\n" + "rem" + 2 % 3);
        System.out.println(findCommonDivisor(6,4));

        // ok now i find the length
//        and just return the

    }



    static int findCommonDivisor(int i,int j){
        if (i == j){
            return i;
        }
        int g = Math.max(i,j);
        int l = Math.min(i,j);
        return findCommonDivisor(g - l,l);
    }
}
