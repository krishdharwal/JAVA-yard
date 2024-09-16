public class reverse {
    public static void main(String[] args) {
        int[] rev = {1,2,3,4,5,6,7,8};
        for (int i = 1; i < rev.length; i++) {
            int max = rev[0];
            if (max < i){
                max = i;
            }
            System.out.println(max);
        }
    }
}
