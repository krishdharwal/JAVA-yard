package questions.concepts;

import java.util.Arrays;

public class Backtrackin2 {
    public static void main(String[] args) {
        boolean[][] board = {
                {true,true,true},
                {true,true,true},
                {true,true,true}};

//        int[][] temp = new int[board.length][board[0].length];
                mazeIndex(" ",board,0,0,new int[board.length][board[0].length],1);
    }

    private static void mazeIndex(String p, boolean[][] maze, int r, int c, int[][] temp,int step) {
        if (r == maze.length-1 && c == maze[0].length-1){
            temp[r][c] = step;
            for (int[] arr : temp){
                System.out.println(Arrays.toString(arr));
            }
          //  System.out.println(Arrays.deepToString(temp));
            System.out.println(p);
            System.out.println();
            return;
        }

        if (maze[r][c] == false){
            return;
        }

        maze[r][c] =false;
        temp[r][c] = step;

        if(r < maze.length-1){
            mazeIndex(p + 'D' ,maze,r+1,c,temp,step+1);
        }
        if (c < maze[0].length-1){
            mazeIndex(p + 'R' ,maze,r,c+1,temp,step+1);
        }
        if (r > 0){
            mazeIndex(p + 'U',maze,r-1,c,temp,step+1);
        }
        if (c > 0){
            mazeIndex(p + 'L',maze,r,c-1,temp,step+1);
        }

        maze[r][c] = true;
        temp[r][c] = 0;
    }
}
