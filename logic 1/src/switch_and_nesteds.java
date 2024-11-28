import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class switch_and_nesteds {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter days as number wise");
        int days = in.nextInt();
        switch (days) {
            case 1 -> System.out.println("monday");
            case 2 -> System.out.println("tuesday");
            case 3 -> System.out.println("wednesday");
            case 4 -> System.out.println("thrusday");
            case 5 -> System.out.println("froday");
            case 6 -> System.out.println("satuerday");
            case 7 -> System.out.println("sunday");
            default -> System.out.println("enter a valid number day");
        }


        int week = in.nextInt();
        switch (week){
            case 1,2,3,4,5 -> System.out.println("weekdays");
            case 6,7 -> System.out.println("weekend");
            default -> System.out.println("not  valid");
        }

        System.out.println("hello");
        int nest = in.nextInt();
        int nest2 = in.nextInt();
        switch (nest){
            case 1 -> System.out.println("hello");
            case 2 -> System.out.println(" how are you sir");
            case 3 -> {
                switch (nest2) {
                    case 21 -> System.out.println("21");
                    case 22 -> System.out.println("22");
                    default -> System.out.println("enter a valid id");
                }
            }
            default -> System.out.println("sorry ");
        }
    }
}




