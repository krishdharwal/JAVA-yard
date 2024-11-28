public class mountain {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6,4,2};
        int peak = peak(arr);
        System.out.println(peak);
    }

    private static int peak(int[] arr) {
        int s = 0;
        int e = arr.length-1;
        while(s < e){
            int m = s + (e - s) / 2;
            if(arr[m] > arr[m+1] ) e = m;

            else s = m+1;

        }
        return s;
    }
}
