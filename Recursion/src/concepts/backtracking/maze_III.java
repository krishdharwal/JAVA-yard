package concepts.backtracking;

import java.util.ArrayList;
import java.util.List;

// Goes All direction And using backtracking

public class maze_III {
    public static List<String> findAllPossiblePath(){
        boolean[][] maze = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        return findPathForMazeIII(new ArrayList<>(),maze,0 ,0,"");
    }

    private static List<String> findPathForMazeIII(List<String> list, boolean[][] maze, int r, int c , String p) {

            if (r == maze.length - 1 && c == maze[0].length - 1) {
                list.add(p);
                return list;
            }

            // backtrack
            if (!maze[r][c]) {
                return list;
            }

            maze[r][c] = false;

            // Down
            if (r < maze.length - 1) {
                findPathForMazeIII(list, maze, r + 1, c, p + "D");
            }

            // Right
            if (c < maze[0].length - 1) {
                findPathForMazeIII(list, maze, r, c + 1, p + "R");
            }

            // Up
            if ( r > 0) {
                findPathForMazeIII(list, maze, r - 1, c, p + "U");
            }

            // Left
            if (c > 0) {
                findPathForMazeIII(list, maze, r, c - 1, p + "L");
            }

            maze[r][c] = true;
            return list;
        }

    public static void main(String[] args) {
        System.out.println(findAllPossiblePath());
    }

}
