package concepts.backtracking;

import java.util.ArrayList;
import java.util.List;

// Only Going Right and Left

public class maze_I {
    public static List<String> findAllPossiblePath(int m , int n){
        return findPathForMazeI(new ArrayList<>(),m ,n,"");
    }

    private static List<String> findPathForMazeI(List<String> list, int i, int j , String p) {
        if (i == 1 && j == 1){
            list.add(p);
            return list;
        }

        // obstacle
        if (i == 2 && j == 2){
            return list;
        }

        if (i > 0){
            findPathForMazeI(list,i-1,j,p + "D");
        }

        if (j > 0){
            findPathForMazeI(list,i,j-1,p + "R");
        }

        return list;
    }

    public static void main(String[] args) {
        System.out.println(  findAllPossiblePath(3,3) );
    }
}
