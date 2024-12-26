package Learning;

public class HeapTraverse {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            int left = i / 2 + 1;
            int right = i / 2 + 2;

            if (left < arr.length){
                System.out.println(arr[left]);
            }
            if (right < arr.length){
                System.out.println(arr[right]);
            }
        }
    }
}
