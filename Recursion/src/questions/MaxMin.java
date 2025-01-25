public class MaxMin {
    public static void main(String[] args) {
        int[] arr = {1,2,3,-4,5};
       XNinarray(arr);
        System.out.println(XNinarray2(arr,arr.length));
        System.out.println(XNinarray3(arr,arr.length));

    }

//    simple approach
    private static void XNinarray(int[] arr) {
        int min  =0 ;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min,arr[i]);
            max = Math.max(max,arr[i]);
        }
        System.out.println("max value is " + min + ", and max value is =" + max);
    }


    // recursion approach

    // fro minimium
    private static int XNinarray2(int[] arr,int n) {
        if (n == 1){
            return arr[0];
        }
     return Math.min(arr[n-1], XNinarray2(arr,n-1));
    }

    // for maximum
    private static int XNinarray3(int[] arr,int n) {
        if (n == 1) {
            return arr[0];
        }
        return Math.max(arr[n - 1], XNinarray3(arr,n-1));
    }
}
