public class arraaay{
    public static void main(String[] args) {
        int[] arr = {12,33,45,66,78,99,100};

        int tar = 45;
        System.out.println(cla(arr,tar));
    }
    static int cla(int[] arr,int tar){
        int start = arr[0];
        int end = arr.length;

        boolean asc = arr[0] < arr[end];

        int mid;
        while(start <= end){
            mid = (start + end) / 2;

            if(tar == arr[mid]){
                return mid;
            }
            if(asc){
                if(tar < arr[mid]){
                    end = mid -1;
                }
                else{
                    start = mid + 1;
                }
            }
            else {
                if (tar > arr[mid])
                {
                    end = mid -1;

                }
                else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}