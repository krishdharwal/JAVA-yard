public class binrySearch {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int ans = binSea(arr,0,arr.length,9);
        System.out.println(ans);
    }
public static int binSea(int[] arr, int s ,int e,int target){
        if(s <= e){
            int m = s + (e - s) / 2;
            if (arr[m] == target) return m+1;
            else if(arr[m] > target) return binSea(arr,s,m-1,target);
            else return binSea(arr,m+1,e,target);
        }
        return -1;
}
}
