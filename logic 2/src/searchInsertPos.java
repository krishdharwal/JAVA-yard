public class searchInsertPos {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};

        int ans  = pos(arr,2);
        System.out.println(ans);
    }

    private static int pos(int[] arr,int tar) {
        if (tar > arr[arr.length-1]){
            return arr.length;
        }

        int s = 0;
        int e  = arr.length-1;
        while(s <= e) {
            int m = s + (e - s) / 2;
            if (arr[m] == tar) return m;
            else if (arr[m] < tar) s = m + 1;
            else e = m - 1;

            //  if (arr[s] != tar && arr[m] == arr.length-1) return arr.length+1;

        }
        return s;
    }
}
