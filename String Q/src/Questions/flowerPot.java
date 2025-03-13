package Questions;

public class flowerPot {

    public boolean canPlaceFlowers(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 1 && helper(arr,i)){
                arr[i] = 1;
                n -= 1;
            }
        }
        System.out.println(n);
        return n <= 0;
    }

    public boolean helper(int[] arr, int idx){
        int l = idx-1;
        int r = idx+1;
        if ((l >= 0 && arr[l] == 0) && (r < arr.length && arr[r] == 0)){
            return true;
        }
        if (idx == 0 && arr[idx] == 0 && arr[r] == 0){
            return true;
        }

        if (idx == arr.length-1 && arr[idx] == 0 && arr[l] == 0){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        flowerPot f = new flowerPot();
        System.out.println(f.canPlaceFlowers(new int[]{1,0,0,0,0,1},2));
    }
}