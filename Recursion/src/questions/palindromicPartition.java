public class palindromicPartition {
    public static void main(String[] args) {
        String s = "geeks";
        partion(s,"");
    }

    private static void partion(String s,String p) {
        if (s.length() == 0){
            System.out.print(p + " ");
            return;
        }
        char ch = s.charAt(0);
        partion(s.substring(1),p +" " + ch);
        partion(s.substring(1),p + " ");
    }
}
