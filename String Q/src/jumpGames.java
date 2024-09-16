public class jumpGames {
    public static void main(String[] args) {
        int[] arr1 = {2,3,1,1,4};
        int[] arr2 = {3,2,1,0,4};
        System.out.println(JG1(arr2));
    }

    private static boolean JG1(int[] arr) {
        // firstly initalize the reaching point or last point
       int finalIndex = arr.length-1;

       // then run loop from back to check
        // if my index and the value in index when sum up will greater or smaller
        for (int i = arr.length-2; i >=0 ; i--) {

            //if it is greater then simply update the target point
            // cause if you reaching to target from index then ,to reach that index check again
            if (i + arr[i] >= finalIndex){
                finalIndex = i;
            }
        }
        // if my target reach to first index means you can reach to your last index
        // if not means it will not
        return finalIndex == 0;
    }
}
