import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class exercise {
    static void print(int i,int s){
        if (i >= 5){
            return;
        }

        print(i+1,s + i);
        System.out.println("up " + i);
        print(i+2,s+i);
        System.out.println("down " + i);
    }

    public static int BinarySearchInRotatedArray(int[] arr ,int tar){
        int s = 0, e =  arr.length-1;
        while (s < e){
            if (arr[s] == tar) return s;
            if (arr[e] == tar) return e;
            s++;
            e--;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(BinarySearchInRotatedArray(new int[]{4,5,6,1,2,3},6));
    }




        public static class SortingTask extends RecursiveTask<int[]> {

            private final int[] arr;

            public SortingTask(int[] arr) {
                this.arr = arr;
            }

            @Override
            protected int[] compute() {
                if(arr.length <= 1) {
                    return arr;
                }
                var task1 = new SortingTask(Arrays.copyOfRange(arr, 0, arr.length/2)).fork();
                var task2 = new SortingTask(Arrays.copyOfRange(arr, arr.length/2, arr.length)).fork();
                int[] arr1 = task1.join();
                int[] arr2 = task2.join();
                int[] result = new int[arr.length];
                int i = 0;
                int j = 0;
                for(;i+j<arr.length;) {
                    if(i==arr1.length) {
                        result[i+j] = arr2[j];
                        j++;
                        continue;
                    }
                    if(j==arr2.length) {
                        result[i+j] = arr1[i];
                        i++;
                        continue;
                    }
                    if(arr1[i]<arr2[j]) {
                        result[i+j] = arr1[i];
                        i++;
                    } else {
                        result[i+j] = arr2[j];
                        j++;
                    }
                }
                return result;
            }
        }

        public int[] sortArray(int[] nums) {
            ForkJoinPool forkJoinPool = ForkJoinPool.commonPool();
            return forkJoinPool.invoke(new SortingTask(nums));
        }

}
