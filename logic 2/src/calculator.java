import java.util.Scanner;

public class calculator
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        int result = 0;
        while(true){


            System.out.println("enter operator = ");
            char opt = in.next().charAt(0);

            switch (opt){
                case 'q' :
                        break;
                case '+' :
                    result += in.nextInt();
                    break;
                case '-' :
                    result -= in.nextInt();
                    break;
                case '*' :
                    result *= in.nextInt() ;
                    break;
                case '/' :
                    result /= in.nextInt();
                    break;
                case '%' :
                    result %= in.nextInt() ;
                default:
                    System.out.println("bhai sahi operator dal !");
            }

            if (opt == 'q'){
                System.out.println(result);

            }
        }


    }
}
