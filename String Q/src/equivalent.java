public class equivalent {
    public static void main(String[] args) {
        String[] arr = {"ab", "c"};
        String[] arr2 = {"a", "bo"};

        String s = String.join("", arr);
        String s2 = String.join("", arr2);

        if (s.equals(s2)){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
