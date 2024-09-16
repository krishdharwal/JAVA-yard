public class findDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,4,4,5,5};
        int ans = dubli(arr);
        System.out.println(ans);
    }

    private static int dubli(int[] arr) {
        int count  = 0;
        int i = 1;
        for (int j = 1; j < arr.length; j++) {
            if(arr[j] != arr[i -1]){
                arr[i] = arr[j];
                count++;
            }
        }
        return count;
    }

}
