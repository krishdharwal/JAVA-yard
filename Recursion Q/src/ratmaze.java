public class ratmaze {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true,true,true,false},
                {true,false,true,true},
                {false,true,true,false},
                {true,true,true,true}
        };
        ratEscape("",maze,0,0);
    }

    private static void ratEscape(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length-1 && c == maze[0].length-1){
            System.out.println(p);
            return;
        }
        if (maze[r][c] == false){
            return;
        }
        maze[r][c] = false;
        if (r < maze.length-1){
            ratEscape(p + "D",maze,r+1,c);
        }

        if (c < maze[0].length-1){
            ratEscape(p + "R",maze,r,c+1);
        }

        if (r > 0){
            ratEscape(p + "U",maze,r-1,c);
        }

        if (c > 0){
            ratEscape(p + "L",maze,r,c-1);
        }

        maze[r][c] = true;
    }
}
