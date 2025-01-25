package concepts;

import java.util.ArrayList;

public class backtracking {
    public static void main(String[] args) {
//        System.out.println(mazeCount(1,1));
//        System.out.println(mazePositionList("", 3, 3,new ArrayList<>()));
//        System.out.println(mazePositionList2("", 3, 3));
//        mazePositionDiagonaly("",3,3);
//        mazeAllPos("",1,1,3,3);

        boolean[][] board = {{true,true,true},{true,true,true},{true,true,true}};
        //mazeObstacle("",board,0,0);
         mazeAllDir("", board,0,0);
    }

    private static int mazeCount(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }
        int left = mazeCount(r - 1, c);
        int right = mazeCount(r, c - 1);
        return left + right;
    }

    public static void mazePosition(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }
        if (r > 1) {
            mazePosition(p + 'D', r - 1, c);
        }
        if (c > 1) {
            mazePosition(p + 'R', r, c - 1);
        }

    }

    public static ArrayList<String> mazePositionList(String p, int r, int c, ArrayList<String> list) {
        if (r == 1 && c == 1) {
            list.add(p);
            return list;
        }
        if (r > 1) {
            mazePositionList(p + 'D', r - 1, c , list);
        }
        if (c > 1) {
            mazePositionList(p + 'R', r, c - 1, list);
        }
        return list;
    }

    public static ArrayList<String> mazePositionList2(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (r > 1) {
           list.addAll( mazePositionList2(p + 'D', r - 1, c ));
        }
        if (c > 1) {
            list.addAll(mazePositionList2(p + 'R', r, c - 1));
        }
        return list;
    }


    public static void mazePositionDiagonaly(String p, int r , int c) {
        if (r == 1 && c == 1) {
            System.out.print(p + " ");
            return;
        }
        if (r > 1 && c > 1 ) {
            mazePositionDiagonaly(p + 'O', r -1, c-1);
        }
        if (r > 1) {
            mazePositionDiagonaly(p + 'D', r-1, c );
        }

        if (c > 1) {
            mazePositionDiagonaly(p + 'R', r, c - 1);
        }

    }
// this is for 1 to n
   public static void mazeAllPos(String p, int r , int c,int rsize, int csize) {
        if (r == 3 && c == 3) {
            System.out.print(p + " ");
            return;
        }
        if (r < 3 && c <  3) {
            mazeAllPos(p + 'T', r +1, c+1,rsize,csize);
        }
        if (r < 3) {
            mazeAllPos(p + 'N', r+1, c ,rsize,csize);
        }

        if (c < 3) {
            mazeAllPos(p + 'S', r, c + 1,rsize,csize);
        }

    }

    public static void mazeObstacle(String p,boolean[][] maze,int r,int c){
        if(r == maze.length-1 && c == maze[0].length-1){
            System.out.println(p);
            return;
        }
        // obstacle
        if(maze[r][c] == false){
            return;
        }

        if (r < maze.length-1){
            mazeObstacle(p + 'D',maze,r+1,c);
        }
        if (c < maze[0].length-1){
            mazeObstacle(p+'R',maze,r,c+1);
        }

    }


    // all direction maze ,without obstacle ,( but not going back to its current path)
    public static void mazeAllDir(String p,boolean[][] maze,int r ,int c){
        if(r == maze.length-1 && c == maze[0].length-1){
            System.out.println(p);
            return;
        }
        if (maze[r][c] == false){
            return;
        }
        maze[r][c] = false;

        if(r < maze.length-1){
            mazeAllDir(p + 'D' ,maze,r+1,c);
        }
        if (c < maze[0].length-1){
            mazeAllDir(p + 'R' ,maze,r,c+1);
        }
        if (r > 0){
            mazeAllDir(p + 'U',maze,r-1,c);
        }
        if (c > 0){
            mazeAllDir(p + 'L',maze,r,c-1);
        }

        maze[r][c] = true;
    }










}