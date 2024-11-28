public class Kth {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        int k = 5;
        int ans = getMissing(arr,k);
        System.out.println(ans);
    }

    private static int getMissing(int[] arr, int k) {
        int[] temp = new int[arr.length ];
        int sum = 0;
        int i = 0;
        while ( i <= arr.length) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] != i) temp[i] = i;
                else break;
            }

            i++;
        }
        for (int l = 0; l < temp.length; l++) {
            if (temp[l] == k) return l;
        }
        return -1;
    }
}
