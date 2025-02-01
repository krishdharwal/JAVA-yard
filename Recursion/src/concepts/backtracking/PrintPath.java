package concepts.backtracking;

import java.util.Arrays;

public class PrintPath {

    public static void printMazePathInMatrixForm(int m , int n){
        printMazePathInMatrixForm(new int[m][n],0,0,"");
    }
    public static int idx = 1;
    private static void printMazePathInMatrixForm(int[][] maze,int r,int c,String p){
        if (r == maze.length-1 && c == maze[0].length-1){
            maze[r][c] = idx;

            for (int[] arr : maze){
                for (int ele : arr){
                    System.out.print(ele + " ");
                }
                System.out.println();
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if (maze[r][c] != 0){
            return;
        }

        maze[r][c] = idx;
        idx = idx + 1;

        // Down
        if ( r < maze.length - 1 ) {
            printMazePathInMatrixForm( maze, r + 1, c, p + "D");
        }

        // Right
        if ( c < maze[0].length - 1 ) {
            printMazePathInMatrixForm( maze, r, c + 1, p + "R");
        }

        // Up
        if ( r > 0 ) {
            printMazePathInMatrixForm( maze, r - 1, c, p + "U");
        }

        // Left
        if ( c > 0 ) {
            printMazePathInMatrixForm( maze, r, c-1, p + "L");
        }
        maze[r][c] = 0;
        idx = idx - 1;
    }

    public static void main(String[] args) {
        printMazePathInMatrixForm(3,3);
    }

}

