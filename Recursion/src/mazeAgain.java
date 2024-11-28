import java.sql.Array;
import java.util.ArrayList;

public class mazeAgain {
    public static void main(String[] args) {
//        System.out.println(countPath(3,3));
//        countPath(3,3);
//        subsetPermutation("","abc");
        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true}};
//        mazeIndex("", maze, 0, 0, new int[maze.length][maze[0].length], 1);

//        dice("",4);
//        System.out.println( subsetPermutation("","abc",new ArrayList<String>()));
//        System.out.println(dice3("",4));

//        System.out.println(mazeStepDRlist1("",0,0,3,new ArrayList<>()));
//        System.out.println();
//        System.out.println(mazeStepDRList2("",0,0,3));
//        AllDir("",maze,0,0);
        System.out.println( Alldirlist("",maze,0,0));
        System.out.println();
        System.out.println( Alldirlist2("",maze,0,0,new ArrayList<String>()));

    }



    private static int countPath(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }
        int left = countPath(r - 1, c);
        int right = countPath(r, c - 1);

        return left + right;
    }


    // a subset of abc
    static void subset(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        subset(p + ch, up.substring(1));
        subset(p, up.substring(1));

    }


    static  ArrayList<String> subsetPermutation(String p, String up,ArrayList<String> list) {

        if (up.isEmpty()) {
//            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
//        ArrayList<String> list = new ArrayList<>();
        int n = p.length();
        char ch = up.charAt(0);
        for (int i = 0; i <= n; i++) {
            String L = p.substring(0, i);
            String R = p.substring(i, n);
        subsetPermutation(L + ch + R, up.substring(1),list);
        }
        return list;
    }

    //    Down right step in maze
    static void mazeStepDR(String p, int r, int c, int n) {
        if (r == n - 1 && c == n - 1) {
            System.out.println(p);
            return;
        }
        if (r < n) {
            mazeStepDR(p + "D", r + 1, c, n);
        }
        if (c < n) {
            mazeStepDR(p + "R", r, c + 1, n);
        }

    }

    static ArrayList<String> mazeStepDRlist1(String p, int r, int c, int n,ArrayList<String> list)   {
        if (r == n - 1 && c == n - 1) {
             list.add(p);
            return list;
        }
        if (r < n) {
            mazeStepDRlist1(p + "D", r + 1, c, n,list);
        }
        if (c < n) {
            mazeStepDRlist1(p + "R", r, c + 1, n,list);
        }

        return list;

    }

    static ArrayList<String>  mazeStepDRList2(String p, int r, int c, int n) {
        if (r == n - 1 && c == n - 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
           ArrayList<String> list = new ArrayList<>();
        if (r < n) {
            list.addAll( mazeStepDRList2(p + "D", r + 1, c, n));
        }
        if (c < n) {
            list.addAll( mazeStepDRList2(p + "R", r , c +1, n));
        }

        return list;

    }

    static void mazeStepDRT(String p, int r, int c, int n) {
        if (r == n - 1 && c == n - 1) {
            System.out.println(p);
            return;
        }
        if (r < n) {
            mazeStepDRT(p + "D", r + 1, c, n);
        }
        if (c < n) {
            mazeStepDRT(p + "R", r, c + 1, n);
        }
        if (r < n && c < n) {
            mazeStepDRT(p + "T", r + 1, c + 1, n);
        }
    }

    static void AllDir(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        if (maze[r][c] == false) {
            return;
        }

        maze[r][c] = false;

        if (r < maze.length - 1) {
            AllDir(p + "D", maze, r + 1, c);
        }

        if (c < maze[0].length - 1) {
            AllDir(p + "R", maze, r, c + 1);
        }

        if (r > 0) {
            AllDir(p + "U", maze, r - 1, c);
        }

        if (c > 0) {
            AllDir(p + "L", maze, r, c - 1);
        }

        if (r < maze.length - 1 && c < maze[0].length - 1) {
            AllDir(p + "T", maze, r + 1, c + 1);
        }
        maze[r][c] = true;
    }


  static ArrayList<String> Alldirlist(String p,boolean[][] maze,int r,int c)
    {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();

        if (maze[r][c] == false) {
            return list;
        }

        maze[r][c] = false;

        if (r < maze.length - 1) {
           list.addAll( Alldirlist(p + "D", maze, r + 1, c));
        }

        if (c < maze[0].length - 1) {
            list.addAll(  Alldirlist(p + "R", maze, r, c + 1));
        }

        if (r > 0) {
            list.addAll(  Alldirlist(p + "U", maze, r - 1, c));
        }

        if (c > 0) {
            list.addAll( Alldirlist(p + "L", maze, r, c - 1));
        }

        if (r < maze.length - 1 && c < maze[0].length - 1) {
            list.addAll(  Alldirlist(p + "T", maze, r + 1, c + 1));
        }
        maze[r][c] = true;
        return list;
    }

    static ArrayList<String> Alldirlist2(String p,boolean[][] maze,int r,int c,ArrayList<String> list)
    {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            list.add(p);
            return list;
        }

        if (maze[r][c] == false) {
            return list;
        }

        maze[r][c] = false;

        if (r < maze.length - 1) {
            Alldirlist2(p + "D", maze, r + 1, c,list);
        }

        if (c < maze[0].length - 1) {
            Alldirlist2(p + "R", maze, r, c + 1,list);
        }

        if (r > 0) {
            Alldirlist2(p + "U", maze, r - 1, c,list);
        }

        if (c > 0) {
            Alldirlist2(p + "L", maze, r, c - 1,list);
        }

        if (r < maze.length - 1 && c < maze[0].length - 1) {
            Alldirlist2(p + "T", maze, r + 1, c + 1,list);
        }
        maze[r][c] = true;
        return list;
    }


    // now print in matrix form and with index
    static void mazeIndex(String p, boolean[][] maze, int r, int c, int[][] indexes, int step) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            indexes[r][c] = step;
            for (int[] arr : indexes) {
                for (int e : arr) {
                    System.out.print(e  + " ");
                }
                System.out.println();
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if (maze[r][c] == false) {
            return;
        }

        maze[r][c] = false;
        indexes[r][c] = step;

        if (r < maze.length - 1) {
            mazeIndex(p + 'D', maze, r + 1, c, indexes, step + 1);
        }

        if (r > 0) {
            mazeIndex(p + 'U', maze, r - 1, c, indexes, step + 1);
        }

        if (c < maze[0].length - 1) {
            mazeIndex(p + 'R', maze, r, c + 1, indexes, step + 1);
        }

        if (c > 0) {
            mazeIndex(p + 'L', maze, r, c - 1, indexes, step + 1);
        }

        if (r < maze.length - 1 && c < maze[0].length - 1) {
            mazeIndex(p + 'T', maze, r + 1, c + 1, indexes, step + 1);
        }

        maze[r][c] = true;
        indexes[r][c] = 0;
    }


    // dice combination             4
    static void dice(String p,int target){
        if (target == 0){
            System.out.println(p);
            return;
        }
        for (int i = 1; i <= target; i++) {
            dice(p + i,target - i);
        }

    }

    static ArrayList<String> dice3(String p,int target){
        if (target == 0){
            ArrayList<String> list = new ArrayList<>();
             list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= target; i++) {
           list.addAll( dice3(p + i,target - i));
        }
        return list;
    }
    // dicelist

    static ArrayList<String> diceList(String p, int target, ArrayList<String> list){
        if (target == 0){
            list.add(p);
            return list;
        }
        for (int i = 1; i <= 6 && i <= target; i++) {
            diceList(p + i,target - i,list);
        }
        list.add(p);
        return list;

    }

}









