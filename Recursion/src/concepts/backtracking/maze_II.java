package concepts.backtracking;

import java.util.ArrayList;
import java.util.List;

// Only Going Right and Left and Diagonally

public class maze_II {
    public static List<String> findAllPossiblePathII(int m , int n){
        return findPathForMazeII(new ArrayList<>(),m ,n,"");
    }

    private static List<String> findPathForMazeII(List<String> list, int i, int j , String p) {
        if (i == 1 && j == 1){
            list.add(p);
            return list;
        }

        if (i > 0){
            findPathForMazeII(list,i-1,j,p + "D");
        }

        if (i > 1 && j > 1) {
            findPathForMazeII(list,i-1,j-1,p + "T");
        }

        if (j > 0){
            findPathForMazeII(list,i,j-1,p + "R");
        }

        return list;
    }

    public static void main(String[] args) {
        System.out.println(  findAllPossiblePathII(3,3) );
    }
}
