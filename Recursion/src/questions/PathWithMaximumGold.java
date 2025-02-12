package questions;

public class PathWithMaximumGold {

   public static int Gmax = 0;
    public static int getMaximumGold(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] != 0){
                    // call and compare
                    int currentMax = findPath(grid,new boolean[grid.length][grid[0].length],i,j,0);
//                    Gmax = Math.max(Gmax,currentMax);
                }
            }
        }
        return Gmax;
    }

    private static int findPath(int[][] grid, boolean[][] bool, int r, int c, int max) {
        if (grid[r][c] == 0 || bool[r][c]){
            Gmax = Math.max(Gmax,max);
            return max;
        }
        int rn = grid.length;
        int cn = grid[0].length;
        bool[r][c] = true;
        max += grid[r][c];

        if (r < rn-1 && grid[r+1][c] != 0){
            findPath(grid,bool,r+1,c,max );
        }

        if (c < cn-1 && grid[r][c+1] != 0){
            findPath(grid,bool,r,c+1,max );
        }

        if (r > 0 && grid[r-1][c] != 0){
            findPath(grid,bool,r-1,c,max );
        }

        if (c > 0 && grid[r][c-1] != 0){
            findPath(grid,bool,r,c-1,max);
        }

        bool[r][c] = false;
        Gmax = Math.max(Gmax,max);
        return max;
    }


    public static void main(String[] args) {
        int[][] grid = {
                {0, 0, 34, 0, 5, 0, 7, 0, 0, 0},
                {0, 0, 0, 0, 21, 0, 0, 0, 0, 0},
                {0, 18, 0, 0, 8, 0, 0, 0, 4, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {15, 0, 0, 0, 0, 22, 0, 0, 0, 21},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 7, 0, 0, 0, 0, 0, 0, 38, 0}
        };
        System.out.println(getMaximumGold(grid));
    }

}
