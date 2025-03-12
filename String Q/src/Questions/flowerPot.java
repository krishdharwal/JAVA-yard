package Questions;

public class flowerPot {
    public boolean canPlaceFlowers(int[] arr, int n) {
        return false;
    }

    public boolean helper(int[] arr, int idx){
        int l = idx -1;
        int r = idx+1;
        if ((l > 0 && arr[l] == 0) && (r < arr.length && arr[r] == 0)){
            return true;
        }
        return false;
    }
}