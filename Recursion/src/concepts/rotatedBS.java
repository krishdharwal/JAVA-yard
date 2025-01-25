package concepts;

public class rotatedBS {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
      //  int ans = RBN(arr,0,arr.length-1,13);
        int ans =BiinaryS(arr,9,0,arr.length-1);

        System.out.println(ans);
    }

    private static int RBN(int[] arr, int s, int e,int tar) {
        if (s > e) return -1;
        int m = s + (e - s) / 2;
        if (arr[m] == tar) return m;
        if (arr[s] <= tar  && arr[m] >= tar) return RBN(arr,s,m-1,tar);
        else return RBN(arr,m+1,e,tar);
    }
    public static int BiinaryS(int[]arr,int tar,int s,int e) {
        while (s <= e){
            int m = s + (e - s) / 2;
            if (arr[m] == tar) return m;
            if (arr[m] > tar) return BiinaryS(arr,tar,s,m-1);
            else return BiinaryS(arr,tar,m+1,e);
        }
        return -1;
    }


}
