import java.util.Scanner;

public class greatthree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a ,b ,c;
        System.out.print("enter three numbers =");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        if (a > b){
            if (a > c){
                System.out.println( "greater" +a);
            }
            else {
                System.out.println("great" + c);
            }
        }

        else {
            if (c > b){
                System.out.println("great" + c);
            }
            else {
                System.out.println("vgreat" + b);
            }
        }
        if (a < b){
            if (a < c){
                System.out.println("small" + a);
            }
            else {
                System.out.println("small" + c);
            }
        }

        else {
            if (c < b){
                System.out.println( "small " + c);
            }
            else {
                System.out.println( " small"+ b);
            }
        }

    }
}
