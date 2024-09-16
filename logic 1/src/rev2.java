public class rev2 {
    public static void main(String[] args) {

                int[] rev = {1,2,3,23,5,6,7};
                int max = rev[0];
                for (int i = 1; i < rev.length; i++) {
                    if (max < rev[i]){
                        max = rev[i];
                    }

                }
                System.out.println(max);
            }
        }



// for finding greater number in array