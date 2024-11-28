package OOP_1_2;

public class maze {
    public static void main(String[] args) {
        // in an given 3X3 matrix find how many ways  to reach the final position

        boolean[][] maze = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };

        path("",0,0,maze);
    }

    private static void path(String p, int r, int c, boolean[][] maze) {
        if (r == maze.length-1 && c == maze[0].length-1){
            System.out.println(p);
            return;
        }

        if (maze[r][c] == false){
            return;
        }

        maze[r][c] = false;

        if (r < maze.length-1){
            path(p + "D",r+1,c,maze);
        }

        if (r > 0){
            path(p + "U" , r-1,c,maze);
        }

        if (c > 0){
            path(p + "L",r,c-1,maze);
        }
        if (c < maze[0].length-1){
            path(p + "R" , r,c+1,maze);
        }

        maze[r][c] = true;
    }
}
