public class arrarq {
    // print number respectively of three numbers
    public static void main(String[] args) {
        int num1,num2,number3;
        num1 = 1332;
        num2 = 43;
        number3 =333 ;
        System.out.println("greate ris = ");
        System.out.println(thregrt(num1,num2,number3));
        System.out.println("the smaller = ");
        System.out.println(thresm(num1,num2,number3));

    }
    static int thregrt(int a,int b,int c){
        if (a > b){
            if (a > c) {
                return a;
            }}
            else if (c > b){
                return c;
            }
            else {
                return b;
            }

        return -1;


    }
    static int thresm(int a,int b,int c){
        if (a < b){
            if (a < c) {
                return a;
            }}
        else if (c < b){
            return c;
        }
        else {
            return b;
        }

        return -1;}
}
