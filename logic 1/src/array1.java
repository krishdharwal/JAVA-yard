import java.util.Scanner;
// making arrays interesting
public class array1 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n,i,j;
        n = ip.nextInt();
        for (i=0; i<n; i++){
            for (j=0; j<i; j++){
                System.out.print("*");

            }
            System.out.println();
        }


    }
}
