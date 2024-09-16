public class containsDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        boolean ans = contain(arr);
        System.out.println(ans);
     }

    private static boolean contain(int[] arr) {
        int i = 0;
        while (i < arr.length){
            if (arr[i] != i+1) return true;
            else i++;

               }
        return false;
    }
}
