public class MaxProd {
    public static void main(String[] args) {


    int[] arr = {1, 2, 3, 4};
    int ans = prodArr(arr);
    System.out.println(ans);
}

    private static int prodArr(int[] arr) {
    int prod = 1;
    for (int i : arr){
        prod *= i;
    }
    return prod;
}
}