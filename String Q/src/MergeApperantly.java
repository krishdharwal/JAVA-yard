public class MergeApperantly {
    public static void main(String[] args) {
        String a = "ab";
        String b  = "pqrt";
        StringBuilder ans  =new StringBuilder();
        for (int i = 0; i < Math.max(a.length(),b.length()); i++) {
            if (i < a.length()) {
                ans.append(a.charAt(i));
            }
            if (i < b.length()) {
                ans.append(b.charAt(i));
            }
        }
        System.out.println(ans);
    }
}
