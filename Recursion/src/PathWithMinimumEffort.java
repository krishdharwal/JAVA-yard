public class PathWithMinimumEffort {
    int minAbsSum = Integer.MAX_VALUE;
    int n = 0;
    int m = 0;
    public int minimumEffortPath(int[][] heights) {
        n = heights.length;
        m = heights[0].length;
        findMinEffortPath(heights, new boolean[n][m], 0 , 0 , 0);
        return minAbsSum;
    }

    public void findMinEffortPath(int[][] arr, boolean[][] bool, int r,int c,int currentPathAbs){
        if(r == n-1 && c == m-1){
            minAbsSum = Math.min(currentPathAbs , minAbsSum);
            return;
        }

        if(bool[r][c] || currentPathAbs >= minAbsSum){
            return ;
        }

        bool[r][c] = true;
        int curr = arr[r][c];

        // down
        if(r < n-1 && !bool[r+1][c]){
           findMinEffortPath(arr,bool,r+1,c,Math.max(Math.abs(curr - arr[r+1][c]),currentPathAbs));
        }

        // right
        if(c < m-1 && !bool[r][c+1]){
            findMinEffortPath(arr,bool,r,c+1,Math.max(Math.abs(curr - arr[r][c+1]),currentPathAbs));
        }

        // up
        if(r > 0 && !bool[r-1][c]){
              findMinEffortPath(arr,bool,r-1,c,Math.max(Math.abs(curr - arr[r-1][c]),currentPathAbs));
        }
        // left
        if(c > 0 && !bool[r][c-1]){
            findMinEffortPath(arr,bool,r,c-1,Math.max(Math.abs(curr - arr[r][c-1]),currentPathAbs));
        }
        bool[r][c] = false;

    }

    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {3, 8, 4},
                {5, 3, 5}
        };
        PathWithMinimumEffort p = new PathWithMinimumEffort();
        int ans = p.minimumEffortPath(array);
        System.out.println(ans);
    }
}
