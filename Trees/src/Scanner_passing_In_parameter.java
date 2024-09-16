import java.util.Scanner;



public class Scanner_passing_In_parameter {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
//        Scanner_in_parameter(in);
        Scanner_in_Recursion(in);
    }

    public static void Scanner_in_parameter(Scanner in){
        System.out.println("add data = ");
        int data = in.nextInt();
        System.out.println(data);
    }

    public static void Scanner_in_Recursion(Scanner in){
        char ch = in.next().charAt(0);
        if (ch == 'X' || ch == 'x'){
            return;
        }
        System.out.println(ch);
        Scanner_in_Recursion(in);
    }
}