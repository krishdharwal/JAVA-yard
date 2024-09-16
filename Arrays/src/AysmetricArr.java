public class AysmetricArr {
    public static void main(String[] args) {
        int[] arr1 = {1,3,5,7};
        int[] arr2 = {1,2,3,6};
        boolean ans = isAsymetric(arr2);
        System.out.println(ans);
    }

    private static boolean isAsymetric(int[] arr) {
        int diff = arr[1] - arr[0];
        for (int i = 2  ; i < arr.length; i++) {
            if (arr[i] - arr[i-1] == diff ) return true;

        }
        return false;
    }
}
