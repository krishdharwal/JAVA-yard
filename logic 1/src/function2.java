import java.util.Scanner;

public class function2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter how many amount of matchstics you want = ");
        int matches = in.nextInt();
        totalmatches(matches);
    }
    static void totalmatches(int a){
        int total = a * 25;
        System.out.println("you will get = " + total + " match sticks");
    }
}








