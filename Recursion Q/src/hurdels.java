
public class hurdels {
    public static void main(String[] args) {
        int[][] ground = {
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 0, 1, 1, 0, 1, 1, 0, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        };
       longestROute("",ground,0,0,1,7);
//        System.out.println(ans);
    }

    private static void longestROute(String p,int[][] ground,int r,int c,int to,int from) {
        if (r == to && c == from){
            if (p.length() == 24) {
                System.out.println(p);
            }
            return ;
        }
        if (ground[r][c] == 0){
            return ;
        }

        ground[r][c] = 0;

        if (r < ground.length-1){
            longestROute(p +"D",ground,r+1,c,to,from)  ;
        }

        if (c < ground[0].length-1){
            longestROute(p +"R",ground,r,c+1,to,from)  ;
        }

        if (r > 0){
            longestROute(p +"U",ground,r-1,c,to,from)  ;
        }

        if (c > 0){
            longestROute(p +"L",ground,r,c-1,to,from)  ;
        }


        ground[r][c] = 1;
    }


}