package Questions;

import java.sql.SQLData;

public class HappyNumber {

    public static boolean HappyOrNot(int num){
    int slow = num;
    int fast = num;

    do {
        slow = Square(slow);
        fast = Square(Square(fast));
    }while (slow != fast);

    if (slow == 1){
    return true;
    }

    return false;
    }

    private static int Square(int num) {
        int total = 0;
        while (num > 0){
            int rem = num % 10;
            num = num / 10;
            total += rem * rem;
        }
        return total;
    }

    public static void main(String[] args) {
        int n = 12;
     Boolean ok = HappyOrNot(n);
        System.out.println(ok);

    }

}
