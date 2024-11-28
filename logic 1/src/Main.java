import java.util.Scanner;
// making of a calculator
public class Main{
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        System.out.println("enter your 1st number =");
        int num1 = ip.nextInt();
        System.out.println("enter your 2nd number =");
        int num2 = ip.nextInt();
        System.out.println("enter your operator in between (*,/,+,-,%");
        char opt = ip.next().charAt(0);

         if(opt == '+'){
            System.out.println(num1 + num2);
        }
         else if(opt == '-'){
             System.out.println(num1 - num2);
         }
         else if(opt == '*'){
             System.out.println(num1 * num2);
         }
         else if(opt == '/'){
             System.out.println(num1 / num2);
         }
         else if(opt == '%'){
             System.out.println(num1 % num2);
         }
         else{
             System.out.println("something went wrong ?");
         }



    }

}