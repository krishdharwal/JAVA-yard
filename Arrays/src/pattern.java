public class pattern
{
    public static void main(String[] args) {
        int n = 5;
//        pattern1(n);
//        pattern2(n);
//        pattern3(n);
//        pattern4(n);
//        pattern5(n);
//        pattern6(n);
//        pattern8(n);

        pattern10(n);


    }

    private static void pattern10(int n) {
        for (int i = 1; i <= 2*n; i++) {
            int total = i>n ? 2*n - i : i;
            int space = n - total;
            for (int s = 1; s <= space; s++) {
                System.out.print(" ");

            }
            for (int j = 1; j <= total; j++) {
                System.out.print(  i + " ");
            }
            System.out.println();
        }
    }

    private static void pattern9(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i ; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int s = 0; s < n-i; s++) {
                if (i == 0) System.out.print(" *");

            else System.out.print("  ");
            }

            System.out.println(" *");

    }
    }

    private static void pattern8(int n) {
        for (int i = 0; i <= n; i++) {
            for (int s = 0; s<= n-i; s++) {
                System.out.print(" ");
            }
            if(i == 0){

            }else {
                System.out.print("*");
            }
            // spaces
            for (int j = 0; j <= 2*i-1; j++) {
                if (i != n) {
                    System.out.print(" ");
                }
            else {
                    System.out.print("*");}
            }
                System.out.println("+");
        }
    }

    private static void pattern7(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i ; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < n-i; j++) {
                System.out.print("*");
            }

            for (int j = 0; j < n-i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void pattern6(int n) {
        for (int i = 0; i <n ; i++) {

            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("*");

            }

            for (int j = 1; j < i; j++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }

    private static void pattern3(int n) {
        for (int i =0; i <= n*2; i++) {
            int totalcol = i > n ? 2*n - i  : i;
            int spaces =n - totalcol;
            for (int j = 1; j <= totalcol; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= spaces; j++) {
                System.out.print("*");
            }
            for (int s = 0; s <= spaces; s++) {
                System.out.print("*");
            }
            for (int s = 1; s <=totalcol; s++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    private static void pattern4(int n) {
        for (int i =0; i <= n*2; i++) {
            int totalcol = i > n ? 2*n - i  : i;
            int spaces =n - totalcol;
            for (int j = 1; j <= totalcol; j++) {
                System.out.print("*");
            }
            for (int j = 0; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int s = 0; s <= spaces; s++) {
                System.out.print(" ");
            }
            for (int s = 1; s <=totalcol; s++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void pattern5(int n) {
        for (int i =0; i <= n*2; i++) {
            int totalcol = i > n ? 2*n - i  : i;
            int spaces =n - totalcol;
            for (int j = 1; j <= totalcol; j++) {
                System.out.print(i);
            }
            for (int j = 0; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int s = 0; s <= spaces; s++) {
                System.out.print(" ");
            }
            for (int s = 1; s <=totalcol; s++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    private static void pattern1(int n) {
        for (int i =0; i < n*2; i++) {
           int totalcol = i > n ? 2*n - i  : i;

           int spaces =n - totalcol;
            for (int s = 0; s <spaces; s++) {
                System.out.print(" ");
            }

            for (int j = 0; j < totalcol; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    private static void pattern2(int n) {
        for (int i =0; i <= n*2; i++) {
            int totalcol = i > n ? 2*n - i  : i;

            int spaces =n - totalcol;
            for (int s = 0; s <= spaces; s++) {
                System.out.print("*");
            }
            for (int s = 1; s <=totalcol; s++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= totalcol; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= spaces; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
