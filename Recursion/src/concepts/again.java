package concepts;

public class again {
    public static void main(String[] args) {
//        System.out.print();
        boolean[][] maze = {{true,true,true},{true,false,true},{true,true,true}};
        mazeObstacle("",maze,0,0);
       // System.out.println(print(5));
//        print(1);

//        int[] arr = {1,2,3,32,23,2};
////        System.out.println(Arrays.toString(arr));
//
//        int[][] arr2 ={
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}};
//
//
//
//        for (int i = 0; i < arr2.length ; i++) {
//            for (int j = 0; j < arr2[0].length ; j++) {
//                System.out.print(arr2[i][j] + " ");
//            }
//            System.out.println();
//
//        }

//        for (int[] i : arr2){
//            System.out.println(Arrays.toString(i));
//        }




    }
    public static void mazeObstacle(String p, boolean[][] maze,int r ,int c){
        if (r == maze.length-1 && c == maze[0].length-1){
            System.out.println(p);
            return;
        }
        if (maze[r][c] == false){
            return;
        }
        if (r < maze.length-1){
            mazeObstacle(p+'D',maze,r+1,c);
        }
        if (c < maze[0].length-1){
            mazeObstacle(p + 'R',maze,r,c+1);
        }
    }



    private static void print(int n) {
        if(n > 5){
            return;
        }
//        System.out.println(n);
        print(n+1);
        System.out.println(n);
    }


}
