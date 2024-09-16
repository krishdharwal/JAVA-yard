import java.util.Arrays;

public class mergeRec
{
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1,9,6,7};
        int[] ans = Mergesortrec(arr);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] Mergesortrec(int[] arr) {
        // agar array ka size 1 hi hai toh itni bakchodi kyu karni
        if (arr.length == 1) return arr;

        int m = arr.length / 2;
        int[] firstHalf = Mergesortrec(Arrays.copyOfRange(arr,0,m));
        int[] secondHalf = Mergesortrec(Arrays.copyOfRange(arr,m,arr.length));

        return mergeBoth(firstHalf,secondHalf);
    }

    private static int[] mergeBoth(int[] firstHalf, int[] secondHalf) {
        int[] both = new int[firstHalf.length + secondHalf.length];
        int i = 0,j = 0,k = 0;
        while (i < firstHalf.length && j < secondHalf.length){
            if (firstHalf[i] < secondHalf[j]) {
                both[k++] = firstHalf[i++];

            }
            // (firstHalf[i] > secondHalf[j])
            else {
                both[k++] = secondHalf[j++];
            }
        }
        // ab ho sakt HAI ki kuch element bachjaye
        while (i < firstHalf.length){
            both[k++] = firstHalf[i++]; }
        while (j < secondHalf.length) {
            both[k++] = secondHalf[j++]; }

        return both;
    }
}
