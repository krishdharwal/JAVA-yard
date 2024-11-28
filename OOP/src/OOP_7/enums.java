package OOP_7;

import java.util.Scanner;

// enums are an collection of constants which act like an object
// and the methods of the enum are internally static and final
// so, to access them we have to use the enum class refrence type
// like Days today = Days.monday;
enum Days{
    monday(1),
    tuesday(2),
    wednesday(3),
    thursday(4),
    friday(5),
    saturday(6),
    sunday(7);

   public int num;

  Days(int num){
      this.num = num;
  }

}




public class enums {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            Days today = Days.saturday;

//        System.out.println(today);
//        System.out.println(today.ordinal() + 1);

            switch (today.ordinal()) {
                case 0 -> System.out.println("holy shit ");
                case 1 -> System.out.println(" jai banjarg bali");
                case 2 -> System.out.println("adha rasta ho gaya");
                case 3 -> System.out.println("ok contol");
                case 4 -> System.out.println("bas ek din or");
                case 5 -> System.out.println(" oh yeh kal chutti ");
                case 6 -> System.out.println("oh shit kal toh test hai");

            }
        }
    }
}
