package Questions;

import java.util.Arrays;

public class sortDiagonal {
    public static void main(String[] args) {
        int[][] grid = {
                {1,7,3},
                {9,8,2},
                {4,5,6}
        };
        sortDiagonal s = new sortDiagonal();
        s.sortMatrix(grid);
        for(int[] arr : grid) {
            System.out.println(Arrays.toString(arr));
        }
    }

    public int[][] sortMatrix(int[][] grid) {
        // top right
        for (int c = 1; c < grid.length-1; c++) {
            diagonalSortAsc(grid,0,c);
        }
        // middle to bottom left
        for (int r = 0; r < grid.length-1; r++) {
            diagonalSortDesc(grid,r,0);
        }

        return grid;
    }

    public void diagonalSortAsc(int[][] grid , int r ,int c){
        int i = grid[0].length-1;
        while (i > 0){
            int r1 = r;
            int c1 = c;
            while (r1 < i && c1 < i){
                if (grid[r1][c1] > grid[r1+1][c1+1]) {
                    int temp = grid[r1][c1];
                    grid[r1][c1] = grid[r1+1][c1+1];
                    grid[r1+1][c1+1] = temp;
                }
                r1++;
                c1++;
            }
            i--;
        }
    }

    public void diagonalSortDesc(int[][] grid , int r ,int c){
        int i = grid[0].length-1;
        while (i > 0){
            int r1 = r;
            int c1 = c;
            while (r1 < i && c1 < i){
                if (grid[r1][c1] < grid[r1+1][c1+1]) {
                    int temp =    grid[r1][c1];
                    grid[r1][c1] =  grid[r1+1][c1+1];
                    grid[r1+1][c1+1] = temp;
                }
                r1++;
                c1++;
            }
            i--;
        }
    }

}
